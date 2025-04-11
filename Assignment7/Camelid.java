public class Camelid extends Animal {
    
        @Override
        public void metabolize() {
            System.out.println("Camelid class, Camelid is metabolizing .");
        }
    
        @Override
        protected void sleep() {
            System.out.println("Camelid class, Just a sleeping camelid.");
        }
    
        @Override
        protected void move() {
            System.out.println("Camelid class, Just a moving camelid.");
        }
}
