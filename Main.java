import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> players = new HashSet<>();
        try (BufferedReader br = new BufferedReader(new FileReader("src/week.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] stats = line.split(",");
                    String name = stats[0];
                    if (!players.contains(name)) {
                        players.add(name);
                    }
                    String position = stats[1];
                    String team = stats[2];
                    int szn = Integer.parseInt(stats[3]);
                    int week = Integer.parseInt(stats[4]);
                    String sznType = stats[5];
                    int comps = Integer.parseInt(stats[6]);
                    int atts = Integer.parseInt(stats[7]);
                    int pyds = Integer.parseInt(stats[8]);
                    int ptds = Integer.parseInt(stats[9]);
                    int ints = Integer.parseInt(stats[10]);
                    int sacks = Integer.parseInt(stats[11]);
                    int sackYds = Integer.parseInt(stats[12]);
                    int sackFumbs = Integer.parseInt(stats[13]);
                    int sackFumbsLost = Integer.parseInt(stats[14]);
                    int passAirYds = Integer.parseInt(stats[15]);
                    int passYAC = Integer.parseInt(stats[16]);
                    int passFDs = Integer.parseInt(stats[17]);
                    int pass2pts = Integer.parseInt(stats[18]);
                    int carries = Integer.parseInt(stats[19]);
                    int rushYds = Integer.parseInt(stats[20]);
                    int rushTDs = Integer.parseInt(stats[21]);
                    int rushFumbs = Integer.parseInt(stats[22]);
                    int rushFumbsLost = Integer.parseInt(stats[23]);
                    int rushFDs = Integer.parseInt(stats[24]);
                    int rush2pts = Integer.parseInt(stats[25]);
                    int recs = Integer.parseInt(stats[26]);
                    int tgts = Integer.parseInt(stats[27]);
                    int recYds = Integer.parseInt(stats[28]);
                    int recTDs = Integer.parseInt(stats[29]);
                    int recFumbs = Integer.parseInt(stats[30]);
                    int recFumbsLost = Integer.parseInt(stats[31]);
                    int recAirYds = Integer.parseInt(stats[32]);
                    int recYAC = Integer.parseInt(stats[33]);
                    int recFDs = Integer.parseInt(stats[34]);
                    int rec2pts = Integer.parseInt(stats[35]);
                    double tgtShare = Double.parseDouble(stats[36]);
                    double airYdsShare = Double.parseDouble(stats[37]);
                    double fPts = Double.parseDouble(stats[38]);
                    double pprPts = Double.parseDouble(stats[39]);
                    int totalYds = Integer.parseInt(stats[40]);
                    double ypa = Double.parseDouble(stats[41]);
                    double ypc = Double.parseDouble(stats[42].trim());
                    double ypr = Double.parseDouble(stats[43]);
                    int touches = Integer.parseInt(stats[44]);
                    // skip next category
                    double compPct = Double.parseDouble(stats[46]);
                    double passTDpct = Double.parseDouble(stats[47]);
                    double intPct = Double.parseDouble(stats[48]);
                    double rushTDpct = Double.parseDouble(stats[49]);
                    double recTDpct = Double.parseDouble(stats[50]);
                    int totalTDs = Integer.parseInt(stats[51]);
                    double tdPct = Double.parseDouble(stats[52]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(players.size());
        for (String x : players) {
            System.out.println(x);
        }
    }
}