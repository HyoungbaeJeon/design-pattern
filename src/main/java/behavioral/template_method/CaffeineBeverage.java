package behavioral.template_method;

public abstract class CaffeineBeverage {
    //******************************************************************
    // 여기가 바로 Template method 의 핵심
    // final 로 선언하여 하위클래스에서 바꾸지 못하게 한다.
    //******************************************************************
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        // hook 값의 설정에 따라 아래 기능을 수행여부를 선택할 수 있다.
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }
    //******************************************************************
    //******************************************************************
    //******************************************************************

    // 하위 클래스에서 구현한다.
    abstract void brew();

    // 하위 클래스에서 구현한다.
    abstract void addCondiments();

    // 공통기능은 상위클래스에서 직접구현한다.
    public void boilWater() {
        System.out.println("Boiling water");
    }

    // 공통기능은 상위클래스에서 직접구현한다.
    public void pourInCup() {
        System.out.println("Pouring into cup");
    }

    // hook 기능
    boolean customerWantsCondiments() {
        return true;
    }
}
