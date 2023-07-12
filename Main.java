import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Player> players = new HashSet<>();
        try(BufferedReader br = new BufferedReader(new FileReader("week.txt"))) {
            String line = br.readLine();
            while (line != null){
                String[] info = line.split(",");
                String name = info[0];
                Player newPlayer = new Player(name);
                if (players.contains(newPlayer)) {
                    for (Player existing_player : players) {
                        if (existing_player.equals(newPlayer)) {
                            String[] stats = Arrays.copyOfRange(info, 6, info.length);
                            existing_player.addStats(info[3], info[4], stats);
                        }
                    }
                } else {
                    newPlayer.setPosition(info[1]);
                    newPlayer.setTeam(info[2]);
                    String[] stats = Arrays.copyOfRange(info, 6, info.length);
                    newPlayer.addStats(info[3], info[4], stats);
                    players.add(newPlayer);
                }
                line = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(players.size());
        for (Player x : players) {
            if (x.getName().equals("A.J. Brown")) {
                System.out.println(x.getYearTotalStat("2022", 23));
            }
        }
        for (Player x : players) {
            System.out.println(x.getName() + " " + x.getPosition()+ " " + x.getTeam());
        }
    }
}
