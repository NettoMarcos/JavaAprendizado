package interfaces.exercicio_02.services;

public interface OnlinePaymentService {

    double paymentFee(double amount);
    double interest(double amount, int months);
}