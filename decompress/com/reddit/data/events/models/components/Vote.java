// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import ft.e;
import et.a;

public final class Vote
{
    public static final a<Vote, Vote.Vote$Builder> ADAPTER;
    public final Boolean affects_karma;
    public final Boolean affects_score;
    public final String author_id;
    
    static {
        ADAPTER = (a)new Vote.Vote$VoteAdapter((Vote$1)null);
    }
    
    private Vote(final Vote.Vote$Builder vote$Builder) {
        this.affects_karma = Vote.Vote$Builder.access$100(vote$Builder);
        this.affects_score = Vote.Vote$Builder.access$200(vote$Builder);
        this.author_id = Vote.Vote$Builder.access$300(vote$Builder);
    }
    
    @Override
    public boolean equals(final Object o) {
        final boolean b = true;
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (!(o instanceof Vote)) {
            return false;
        }
        final Vote vote = (Vote)o;
        final Boolean affects_karma = this.affects_karma;
        final Boolean affects_karma2 = vote.affects_karma;
        if (affects_karma == affects_karma2 || (affects_karma != null && affects_karma.equals(affects_karma2))) {
            final Boolean affects_score = this.affects_score;
            final Boolean affects_score2 = vote.affects_score;
            if (affects_score == affects_score2 || (affects_score != null && affects_score.equals(affects_score2))) {
                final String author_id = this.author_id;
                final String author_id2 = vote.author_id;
                boolean b2 = b;
                if (author_id == author_id2) {
                    return b2;
                }
                if (author_id != null && author_id.equals(author_id2)) {
                    b2 = b;
                    return b2;
                }
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final Boolean affects_karma = this.affects_karma;
        int hashCode = 0;
        int hashCode2;
        if (affects_karma == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = affects_karma.hashCode();
        }
        final Boolean affects_score = this.affects_score;
        int hashCode3;
        if (affects_score == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = affects_score.hashCode();
        }
        final String author_id = this.author_id;
        if (author_id != null) {
            hashCode = author_id.hashCode();
        }
        return (((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder r = a.r("Vote{affects_karma=");
        r.append(this.affects_karma);
        r.append(", affects_score=");
        r.append(this.affects_score);
        r.append(", author_id=");
        return a.o(r, this.author_id, "}");
    }
    
    public void write(final e e) throws IOException {
        Vote.ADAPTER.write(e, (Object)this);
    }
}
