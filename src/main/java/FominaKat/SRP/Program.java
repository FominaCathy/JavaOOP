package FominaKat.SRP;

public class Program {

    /**
     * TODO: Переработать структуру приложения Order, приложение должно соответствовать
     *  принципу SRP.
     *
     * @param args
     */
    public static void main(String[] args) {
        Order order1 = new Order();
        InputData inputData = new InputData();

        System.out.println("Укажите параметры заказа:");
        inputData.inputFromConsole(order1);

        OutputData outputData = new OutputData();
        outputData.saveToJson(order1);


    }

}
