public class creatures {

    public String name,sound,consume,speed;

    public creatures(String name, String sound, String consume, String speed){

        this.name = name;
        this.sound = sound;
        this.consume = consume;
        this.speed = speed;

    }

    @Override
    public String toString(){

        creatures creatures = new creatures(name, sound, consume,speed);
        return creatures.name + creatures.sound + creatures.consume + creatures.speed ;

    }

}
