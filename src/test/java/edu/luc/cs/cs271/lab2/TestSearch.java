package edu.luc.cs.cs271.lab2;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;

public class TestSearch {
  
  Team[] makeArrayFixture(final int size) {
    final Team[] array = new Team[size];
    for (int i = 0; i < size; i++) {
      final String s = Integer.toString(i);
      array[i] = new Team("Team " + s, "Coach " + s, i * 100 + 50);
    }
    return array;
  }

  // DONE makeListFixture
  List<Team> makeListFixture(final int size) {
    final List<Team> arraylist = Arrays.asList(new Team[size]);
    for(int i = 0; i < size; i++) {
      final String s = Integer.toString(i);
      arraylist.set(i, new Team("Team " + s, "Coach " + s, i * 100 + 50));
    }
    return arraylist;
  }

  @Test
  public void testFindPositionArray0() {
    final Team[] arr = makeArrayFixture(0);
    assertFalse(Search.findTeamPosition(arr, "Team 5").isPresent());
  }

  @Test
  public void testFindPositionArray10s() {
    final Team[] arr = makeArrayFixture(10);
    assertTrue(Search.findTeamPosition(arr, "Team 5").isPresent());
  }

  @Test
  public void testFindPositionArray10f() {
    final Team[] arr = makeArrayFixture(10);
    assertFalse(Search.findTeamPosition(arr, "Team 11").isPresent());
  }
  
  // DONE: testFindPositionList0, 10s, 10f
  @Test
  public void testFindPositionList0() {
    final List<Team> list = makeListFixture(0);
    assertFalse(Search.findTeamPosition(list, "Team 5").isPresent());
  }
  
  @Test
  public void testFindPositionList10s() {
    final List<Team> list = makeListFixture(10);
    assertTrue(Search.findTeamPosition(list, "Team 5").isPresent());
  }
  
  @Test
  public void testFindPositionList10f() {
    final List<Team> list = makeListFixture(10);
    assertFalse(Search.findTeamPosition(list, "Team 11").isPresent());
  }
  
  // DONE: testFindMinFundingArray for several sizes and scenarios
  @Test
  public void testMinFundingArray50() {
    final int funding = 50;
    final Team[] arr = makeArrayFixture(1);
    assertTrue(Search.findTeamMinFunding(arr, funding).isPresent());
  }
  
  @Test
  public void testMinFundingArray150() {
    final int funding = 150;
    final Team[] arr = makeArrayFixture(2);
    assertTrue(Search.findTeamMinFunding(arr, funding).isPresent());
  }
  
  @Test
  public void testMinFundingArray500() {
    final int funding = 500;
    final Team[] arr = makeArrayFixture(1);
    assertFalse(Search.findTeamMinFunding(arr, funding).isPresent());
  }

  // DONE: testFindMinFundingArrayFast for several sizes and scenarios
  @Test
  public void testMinFundingArrayFast50() {
    final int funding = 50;
    final Team[] arr = makeArrayFixture(1);
    assertTrue(Search.findTeamMinFundingFast(arr, funding).isPresent());
  }
  
  @Test
  public void testMinFundingArrayFast150() {
    final int funding = 150;
    final Team[] arr = makeArrayFixture(2);
    assertTrue(Search.findTeamMinFundingFast(arr, funding).isPresent());
  }
  
  @Test
  public void testMinFundingArrayFast500() {
    final int funding = 500;
    final Team[] arr = makeArrayFixture(1);
    assertFalse(Search.findTeamMinFundingFast(arr, funding).isPresent());
  }
}
