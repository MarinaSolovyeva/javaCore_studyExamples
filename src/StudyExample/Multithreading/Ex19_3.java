package StudyExample.Multithreading;

import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ex19_3 {

    public static void main(String[] args) {

        List<Integer> list = IntStream.range(0, 5_000)
                .boxed()
                .collect(Collectors.toList());
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> future = executor.submit(new ActionCallable(list));
        executor.shutdown();
        try {
            System.out.println(future.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}

class ActionCallable implements Callable<Integer> {
    private List<Integer> integers;
    public ActionCallable(List<Integer> integers) {
        this.integers = integers;
    }
    @Override
    public Integer call() {
        int sum = 0;
        for (int number : integers) {
            sum += number;
        }
        return sum;
    }
}

