import java.util.HashMap;
import java.util.Map;

public class Player {
    HashMap<String, HashMap<String, String[]>> year = new HashMap<>();
    private String name;
    private String position;
    private String team;

    public Player(String p_name) {
        name = p_name;
    }

    public void setPosition(String p_position) {
        position = p_position;
    }

    public void setTeam(String p_team) {
        team = p_team;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getTeam() {
        return team;
    }

    public void addStats(String p_year, String p_week, String[] stats) {
        if(year.containsKey(p_year)) {
            HashMap<String, String[]> weeks = year.get(p_year);
            weeks.put(p_week, stats);
        } else {
            HashMap<String, String[]> week = new HashMap<>();
            week.put(p_week, stats);
            year.put(p_year, week);
        }
    }

    public int getYearTotalStat(String p_year,  int index) {
        int val = 0;
        for (Map.Entry<String, String[]> entry : year.get(p_year).entrySet()) {
            val = val + Integer.parseInt(entry.getValue()[index]);
        }
        return val;
    }

    @Override
    public int hashCode() {
        String h_name = name;
        h_name.replace(" ", "");
        h_name.replace(".", "");
        char[] c = h_name.toCharArray();
        int result = 0;
        for (Character ss : c) {
            result = result + Character.getNumericValue(ss);
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || o.getClass() != this.getClass()) {
            return false;
        }
        Player player2 = (Player) o;
        return player2.getName().equals(name);
    }
}
