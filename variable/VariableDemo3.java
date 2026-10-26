package variable;
    public class VariableDemo3 {
        public static void main(String[] args) {


            //BMI = 体重/身高的平方

            //1.定义体重变量
            double weight = 80;

            //2.定义身高变量
            double height = 1.76;

            //3.计算BMI
            double bmi = weight / (height * height);
            System.out.println(bmi);
        }
    }
