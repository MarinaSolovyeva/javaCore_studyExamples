package StudyExample.Sealed;

public sealed class Device permits Computer, Mobile {

}

sealed class Computer extends Device permits Dell {

}

non-sealed class Dell extends Computer {
}

non-sealed class Mobile extends Device{
}

class Iphone extends Mobile{

}

