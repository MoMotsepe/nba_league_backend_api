package com.NBA.nba_zone.player;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="nba_league")
public class Player {

    @Id
    @Column(name = "player",unique = true, nullable = false)
    private String name;
    private String team;
    private String pos;
    private Integer age;
    private Integer gp;
    private Double mpg;
    private Double ppg;
    private Double rpg;
    private Double apg;
    private Double spg;
    private Double bpg;

    @Column (name= "\"FG%\"")
    private Double fg;

    @Column (name = "\"3P%\"")
    private Double threepoint;

    @Column (name = "\"FT%\"")
    private Double ft;

    //Default Constructor
    public Player() {}

    //full constructor
    public Player(String name, String team, String pos, Integer age, Integer gp, Double mpg, Double ppg, Double rpg, Double apg, Double spg, Double bpg, Double fg, Double threepoint, Double ft) {
        this.name = name;
        this.team = team;
        this.pos = pos;
        this.age = age;
        this.gp = gp;
        this.mpg = mpg;
        this.ppg = ppg;
        this.rpg = rpg;
        this.apg = apg;
        this.spg = spg;
        this.bpg = bpg;
        this.fg = fg;
        this.threepoint = threepoint;
        this.ft = ft;
    }

    public Player (String name) {
        this.name = name;
    }

    //Getters and Setters
    //For keeping data safe

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getGp() {
        return gp;
    }

    public void setGp(Integer gp) {
        this.gp = gp;
    }

    public Double getMpg() {
        return mpg;
    }

    public void setMpg(Double mpg) {
        this.mpg = mpg;
    }

    public Double getPpg() {
        return ppg;
    }

    public void setPpg(Double ppg) {
        this.ppg = ppg;
    }

    public Double getRpg() {
        return rpg;
    }

    public void setRpg(Double rpg) {
        this.rpg = rpg;
    }

    public Double getApg() {
        return apg;
    }

    public void setApg(Double apg) {
        this.apg = apg;
    }

    public Double getSpg() {
        return spg;
    }

    public void setSpg(Double spg) {
        this.spg = spg;
    }

    public Double getBpg() {
        return bpg;
    }

    public void setBpg(Double bpg) {
        this.bpg = bpg;
    }

    public Double getFg() {
        return fg;
    }

    public void setFg(Double fg) {
        this.fg = fg;
    }

    public Double getThreepoint() {
        return threepoint;
    }

    public void setThreepoint(Double threepoint) {
        this.threepoint = threepoint;
    }

    public Double getFt() {
        return ft;
    }

    public void setFt(Double ft) {
        this.ft = ft;
    }
}
