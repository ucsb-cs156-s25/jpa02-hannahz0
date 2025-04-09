package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {
    Team team;
    Team team_1;
    Team team_2;
    Team team_3;
    Team team_4;
    Team team_5;

    @BeforeEach
    public void setup() {
        team = new Team("test-team"); 

        team_1 = new Team("test-team");

        team_2 = new Team("test-team-A");
        team_2.addMember("Allison");

        team_3 = new Team("test-team-B");
        team_3.addMember("Allison");

        team_4 = new Team("test-team-B");
        team_4.addMember("Bob");
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }

    // 100% mutation coverage (all mutants timed out or killed)

    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }

    @Test
    public void equals_returns_correct_bool() {
        // case 1: same object
        assertEquals(team.equals(team), true);
        // case 2: different class
        assertEquals(team.equals("String"), false);
        // case 3
        assertEquals(team_2.equals(team_3), false);
        assertEquals(team_2.equals(team_4), false);
        assertEquals(team_3.equals(team_4), false);
    }

    @Test
    public void check_hashCode_val() {
        int result = team.hashCode();
        int expectedResult = -1226298695;
        assertEquals(expectedResult, result);
    }

}
