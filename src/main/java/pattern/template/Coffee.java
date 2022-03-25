package pattern.template;

public class Coffee extends CaffeineBeverage {
    @Override
    public void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }

    @Override
    public boolean customerWantsCondiments() {
        // 상위 클래스에서 선언된 hook 기능을 하위에서 구현한다.
        String answer = "y";
        if (answer.toLowerCase().startsWith("y"))
            return true;
        else
            return false;
    }
}

