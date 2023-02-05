import java.io.IOException;

public class Program {
    public static void main(String[] args) throws IOException {
        Present obj=new Present(new Calculator(),new View_Module(), new CreateLog());

        obj.startProgram();
    }
}
