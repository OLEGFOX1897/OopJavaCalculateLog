import java.io.IOException;

/**
 * Класс, задающий общий алгоритм запуска программы. Так же реализовано логирование.
*/
public class Present {
    Calculator calculator;
    View_Module viewModule;

    CreateLog createLog;

    public Present(Calculator c, View_Module v, CreateLog cl)  {
        calculator=c;
        viewModule=v;
        createLog=cl;
    }
    public void startProgram() throws IOException {
        createLog.createFileLog();
        double a=0, b=0;
        int indOut=0;
        do {
            try{
                a=viewModule.getValue("Введите первое число a= \n");
                createLog.logMessage("a= "+ a);
                b=viewModule.getValue("Введите второе число b= \n");
                createLog.logMessage("b= "+ b);
                try{
                    System.out.println("(+)-1, (-)-2, (*)-3, (/)-4");
                    int sign=viewModule.getSign("Введите цифру знака: \n");
                    if (sign<=4 & sign>0){
                        createLog.logMessage("Был введен номер знака= "+ sign+"  ((+)-1, (-)-2, (*)-3, (/)-4) \n");
                        calculator.setNum(a,b);
                        viewModule.printNum("Вычисленное значение=", calculator.result(sign));
                        createLog.logMessage("Полученное значение=" + calculator.result(sign));
                        try {
                            int outProgram= viewModule.getInt("Eсли хотите выполнить еще вычисления введите 1\n");
                            if(outProgram==1){
                                indOut=0;
                                createLog.logMessage("Продолжаем вычисление");
                            }else{
                                indOut=1;
                                createLog.logMessage("Программа завершена");
                            }
                        } catch (Exception e){
                            createLog.logMessage("Ошибка ввода");
                            indOut=1;
                        }
                    }else {
                        createLog.logMessage("Знак был введен некорректно");
                        indOut=1;
                    }
                } catch (Exception e){
                    createLog.logMessage("Ошибка в воде знака");
                    indOut=1;
                }
            } catch (Exception e){
                createLog.logMessage("Ошибка ввода числа");
                indOut=1;
            }
        }while (indOut==0);
//        int sign=0;
    }
}
