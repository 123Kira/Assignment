public class TryCatch{
        public static void main(String args[]) {
            try
            {
                int a = 99, b = 0;
                int c = a / b;

            }
            catch (ArithmeticException ex)
            {
                System.out.println("Arithmetic " + ex);
            }
            catch (NumberFormatException ex)
            {
                System.out.println("Number Format Exception " + ex);
            }
            finally{
                System.out.println("Finish");
            }
        }
}

