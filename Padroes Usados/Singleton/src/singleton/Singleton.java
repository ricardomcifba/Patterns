
package singleton;


public final class Singleton {

        private static Singleton instance;
        private int value;
        
        protected Singleton(){
            System.out.println("Singleton construído.");
        }
        
        public static synchronized Singleton getInstance(){
            if(instance == null)
                instance = new Singleton();
            return instance;
        }

    String getInfo() {
        return getClass().getName()
        +  ",carregado por " + getClass().getClassLoader() 
        + ", id#" + System.identityHashCode(this);
                
    }

    public int getValue() {
        return value;
    }

    public void setValue(int parm) {
        this.value = parm;
    }
    
    public boolean equals(Singleton parm){
        return (System.identityHashCode(this)== System.identityHashCode(parm));
    }
    
}
