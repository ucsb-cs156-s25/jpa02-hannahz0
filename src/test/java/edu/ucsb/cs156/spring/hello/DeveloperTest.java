package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import org.junit.jupiter.api.Test;

public class DeveloperTest {

    @Test
    public void testPrivateConstructor() throws Exception {
        // this hack is from https://www.timomeinen.de/2013/10/test-for-private-constructor-to-get-full-code-coverage/
        Constructor<Developer> constructor = Developer.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()),"Constructor is not private");

        constructor.setAccessible(true);
        constructor.newInstance();
    }

    @Test
    public void getName_returns_correct_name() {
        // <https://bit.ly/cs156-s25-teams>
        assertEquals("Hannah Z", Developer.getName());
    }
    
    // 100% mutation coverage (all mutants timed out or killed)

    @Test
    public void
    getGithubId_returns_correct_githubId() {
        assertEquals("hannahz0", Developer.getGithubId());
    }

    @Test
    public void getTeam_returns_team_with_correct_name() {
        Team  t = Developer.getTeam();
        assertEquals("s25-07", t.getName());
    }

    @Test
    public void getTeam_returns_team_with_Annika() {
        Team  t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Annika D"),"Team should contain Annika D");
    }

    @Test
    public void getTeam_returns_team_with_Hannya() {
        Team  t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Hannya Y"),"Team should contain Hannya Y");
    }

    @Test
    public void getTeam_returns_team_with_Shelly() {
        Team  t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Shelly Z"),"Team should contain Shelly Z");
    }

    @Test
    public void getTeam_returns_team_with_Forrest() {
        Team  t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Forrest Z"),"Team should contain Forrest Z");
    }

    @Test
    public void getTeam_returns_team_with_Steven() {
        Team  t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Steven L"),"Team should contain Steven L");
    }

    @Test
    public void getTeam_returns_team_with_Hannah() {
        Team  t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Hannah Z"),"Team should contain Hannah Z");
    }

}
