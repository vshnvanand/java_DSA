public class Smartphone implements Phone, MusicPlayer, Camera {
    
    @Override
    public void takePhoto(){
        System.out.println("Takin photo");
    }

    @Override
    public void recordVideo(){
        System.out.println("Recording Vdo");
    }

    @Override
    public void MakeCall(int Number){
        System.out.println("Calling number");
    }

    @Override
    public void EndCall(){
        System.out.println("Call ended");
    }

    @Override
    public void PlayMusic(){
        System.out.println("Music Start");
    }

    @Override
    public void StopMusic(){
        System.out.println("Music ended");
    }
}
