package com.tts.techtalenttwitter.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "tag_id")
    private Long id;

    @Column(name = "tag_phrase")
    private String phrase;

    @ManyToMany(mappedBy = "tags")
    private List<Tweet> tweets;

    public Tag(){

    }

    

    public Long getId() {
    return id;
    }

    public String getPhrase() {
    return phrase;
    }

    public void setPhrase(String phrase) {
    this.phrase = phrase;
    }

    public List<Tweet> getTweets() {
    return tweets;
    }

    public void setTweets(List<Tweet> tweets) {
    this.tweets = tweets;
    }

    @Override
    public String toString() {
    return "Tag [id=" + id + ", phrase=" + phrase + ", tweets=" + tweets + "]";
    }
}
