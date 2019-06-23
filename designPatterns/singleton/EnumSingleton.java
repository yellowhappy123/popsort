package popsort.designPatterns.singleton;

/**
 * EnumSingleton
 * Created by huangx on 2019/6/23.
 */
public enum EnumSingleton {
    EnumSingletonInstance;

    public static void main(String[] args) {
        System.out.println(EnumSingleton.EnumSingletonInstance.hashCode());
        System.out.println(EnumSingleton.EnumSingletonInstance.hashCode());
        System.out.println(EnumSingleton.EnumSingletonInstance.hashCode());
    }
}
