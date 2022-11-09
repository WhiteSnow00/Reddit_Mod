// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import kt.e;
import ak0.n;
import java.util.Collections;
import java.util.List;
import jt.a;

public final class ChatHomeFeedBoosting
{
    public static final a<ChatHomeFeedBoosting, ChatHomeFeedBoosting.ChatHomeFeedBoosting$Builder> ADAPTER;
    public final List<Integer> original_positions;
    public final List<Integer> positions;
    public final List<String> post_ids;
    public final List<String> subreddit_ids;
    
    static {
        ADAPTER = (a)new ChatHomeFeedBoosting.ChatHomeFeedBoosting$ChatHomeFeedBoostingAdapter((ChatHomeFeedBoosting$1)null);
    }
    
    private ChatHomeFeedBoosting(final ChatHomeFeedBoosting.ChatHomeFeedBoosting$Builder chatHomeFeedBoosting$Builder) {
        final List access$100 = ChatHomeFeedBoosting.ChatHomeFeedBoosting$Builder.access$100(chatHomeFeedBoosting$Builder);
        final List<Integer> list = null;
        List<String> unmodifiableList;
        if (access$100 == null) {
            unmodifiableList = null;
        }
        else {
            unmodifiableList = Collections.unmodifiableList((List<? extends String>)ChatHomeFeedBoosting.ChatHomeFeedBoosting$Builder.access$100(chatHomeFeedBoosting$Builder));
        }
        this.subreddit_ids = unmodifiableList;
        List<String> unmodifiableList2;
        if (ChatHomeFeedBoosting.ChatHomeFeedBoosting$Builder.access$200(chatHomeFeedBoosting$Builder) == null) {
            unmodifiableList2 = null;
        }
        else {
            unmodifiableList2 = Collections.unmodifiableList((List<? extends String>)ChatHomeFeedBoosting.ChatHomeFeedBoosting$Builder.access$200(chatHomeFeedBoosting$Builder));
        }
        this.post_ids = unmodifiableList2;
        List<Integer> unmodifiableList3;
        if (ChatHomeFeedBoosting.ChatHomeFeedBoosting$Builder.access$300(chatHomeFeedBoosting$Builder) == null) {
            unmodifiableList3 = null;
        }
        else {
            unmodifiableList3 = Collections.unmodifiableList((List<? extends Integer>)ChatHomeFeedBoosting.ChatHomeFeedBoosting$Builder.access$300(chatHomeFeedBoosting$Builder));
        }
        this.positions = unmodifiableList3;
        List<Integer> unmodifiableList4;
        if (ChatHomeFeedBoosting.ChatHomeFeedBoosting$Builder.access$400(chatHomeFeedBoosting$Builder) == null) {
            unmodifiableList4 = list;
        }
        else {
            unmodifiableList4 = Collections.unmodifiableList((List<? extends Integer>)ChatHomeFeedBoosting.ChatHomeFeedBoosting$Builder.access$400(chatHomeFeedBoosting$Builder));
        }
        this.original_positions = unmodifiableList4;
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
        if (!(o instanceof ChatHomeFeedBoosting)) {
            return false;
        }
        final ChatHomeFeedBoosting chatHomeFeedBoosting = (ChatHomeFeedBoosting)o;
        final List<String> subreddit_ids = this.subreddit_ids;
        final List<String> subreddit_ids2 = chatHomeFeedBoosting.subreddit_ids;
        if (subreddit_ids == subreddit_ids2 || (subreddit_ids != null && subreddit_ids.equals(subreddit_ids2))) {
            final List<String> post_ids = this.post_ids;
            final List<String> post_ids2 = chatHomeFeedBoosting.post_ids;
            if (post_ids == post_ids2 || (post_ids != null && post_ids.equals(post_ids2))) {
                final List<Integer> positions = this.positions;
                final List<Integer> positions2 = chatHomeFeedBoosting.positions;
                if (positions == positions2 || (positions != null && positions.equals(positions2))) {
                    final List<Integer> original_positions = this.original_positions;
                    final List<Integer> original_positions2 = chatHomeFeedBoosting.original_positions;
                    boolean b2 = b;
                    if (original_positions == original_positions2) {
                        return b2;
                    }
                    if (original_positions != null && original_positions.equals(original_positions2)) {
                        b2 = b;
                        return b2;
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final List<String> subreddit_ids = this.subreddit_ids;
        int hashCode = 0;
        int hashCode2;
        if (subreddit_ids == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = subreddit_ids.hashCode();
        }
        final List<String> post_ids = this.post_ids;
        int hashCode3;
        if (post_ids == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = post_ids.hashCode();
        }
        final List<Integer> positions = this.positions;
        int hashCode4;
        if (positions == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = positions.hashCode();
        }
        final List<Integer> original_positions = this.original_positions;
        if (original_positions != null) {
            hashCode = original_positions.hashCode();
        }
        return ((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("ChatHomeFeedBoosting{subreddit_ids=");
        k.append(this.subreddit_ids);
        k.append(", post_ids=");
        k.append(this.post_ids);
        k.append(", positions=");
        k.append(this.positions);
        k.append(", original_positions=");
        return n.r(k, (List)this.original_positions, "}");
    }
    
    public void write(final e e) throws IOException {
        ChatHomeFeedBoosting.ADAPTER.write(e, (Object)this);
    }
}
