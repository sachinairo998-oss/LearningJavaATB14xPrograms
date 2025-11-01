package ex_25_ENUM;

enum Env{
   Dev("https://dev.myapp.com"),
    Staging("https://staging.myapp.com"),
    Production("https://production.myapp.com");

   private final String baseUrl; // constructor

   Env(String baseUrl) {
       this.baseUrl = baseUrl;
   }
   public String getBaseUrl(){
       return baseUrl;
   }
}

