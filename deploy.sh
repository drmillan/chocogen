mvn clean compile assembly:single
cp target/service-generator-0.0.1-SNAPSHOT-jar-with-dependencies.jar $HOME/bin/generator.jar
cp run.sh $HOME/bin/generator.sh
chmod 755 $HOME/bin/generator.sh
