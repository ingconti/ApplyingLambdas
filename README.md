# ApplyingLambdas
2020 ingsw basic sample

PLEASE fix POM to use Lambdas:


<plugin>
          
          <artifactId>maven-compiler-plugin</artifactId>
        
          <version>3.8.0</version>
          <configuration>
          <source>1.8</source>
            <target>1.8</target>
            </configuration>
          
        
          
CODE: see in particular:


    Effect eff1 = (p) -> {
        p.moveRight();
    };

    Effect eff2 = (p) -> {
        p.moveRight();
        p.moveUp();
        p.moveRight();

    };
...

        p1.applyToMe(eff1);
        p1.showStatus();

        Player p2 = new Player();
        p2.applyToMe(eff2);
        p2.showStatus();
   
...
