// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import kt.e;
import jt.a;

public final class Comment
{
    public static final a<Comment, Comment.Comment$Builder> ADAPTER;
    public final String author_id;
    public final String body_text;
    public final String content_type;
    public final Long created_timestamp;
    public final Long depth;
    public final String id;
    public final Long last_edited_timestamp;
    public final Long number_gildings;
    public final String parent_id;
    public final String post_id;
    public final Long score;
    public final String type;
    public final Double upvote_ratio;
    
    static {
        ADAPTER = (a)new Comment.Comment$CommentAdapter((Comment$1)null);
    }
    
    private Comment(final Comment.Comment$Builder comment$Builder) {
        this.id = Comment.Comment$Builder.access$100(comment$Builder);
        this.post_id = Comment.Comment$Builder.access$200(comment$Builder);
        this.parent_id = Comment.Comment$Builder.access$300(comment$Builder);
        this.body_text = Comment.Comment$Builder.access$400(comment$Builder);
        this.author_id = Comment.Comment$Builder.access$500(comment$Builder);
        this.number_gildings = Comment.Comment$Builder.access$600(comment$Builder);
        this.score = Comment.Comment$Builder.access$700(comment$Builder);
        this.upvote_ratio = Comment.Comment$Builder.access$800(comment$Builder);
        this.created_timestamp = Comment.Comment$Builder.access$900(comment$Builder);
        this.type = Comment.Comment$Builder.access$1000(comment$Builder);
        this.depth = Comment.Comment$Builder.access$1100(comment$Builder);
        this.content_type = Comment.Comment$Builder.access$1200(comment$Builder);
        this.last_edited_timestamp = Comment.Comment$Builder.access$1300(comment$Builder);
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
        if (!(o instanceof Comment)) {
            return false;
        }
        final Comment comment = (Comment)o;
        final String id = this.id;
        final String id2 = comment.id;
        if (id == id2 || (id != null && id.equals(id2))) {
            final String post_id = this.post_id;
            final String post_id2 = comment.post_id;
            if (post_id == post_id2 || (post_id != null && post_id.equals(post_id2))) {
                final String parent_id = this.parent_id;
                final String parent_id2 = comment.parent_id;
                if (parent_id == parent_id2 || (parent_id != null && parent_id.equals(parent_id2))) {
                    final String body_text = this.body_text;
                    final String body_text2 = comment.body_text;
                    if (body_text == body_text2 || (body_text != null && body_text.equals(body_text2))) {
                        final String author_id = this.author_id;
                        final String author_id2 = comment.author_id;
                        if (author_id == author_id2 || (author_id != null && author_id.equals(author_id2))) {
                            final Long number_gildings = this.number_gildings;
                            final Long number_gildings2 = comment.number_gildings;
                            if (number_gildings == number_gildings2 || (number_gildings != null && number_gildings.equals(number_gildings2))) {
                                final Long score = this.score;
                                final Long score2 = comment.score;
                                if (score == score2 || (score != null && score.equals(score2))) {
                                    final Double upvote_ratio = this.upvote_ratio;
                                    final Double upvote_ratio2 = comment.upvote_ratio;
                                    if (upvote_ratio == upvote_ratio2 || (upvote_ratio != null && upvote_ratio.equals(upvote_ratio2))) {
                                        final Long created_timestamp = this.created_timestamp;
                                        final Long created_timestamp2 = comment.created_timestamp;
                                        if (created_timestamp == created_timestamp2 || (created_timestamp != null && created_timestamp.equals(created_timestamp2))) {
                                            final String type = this.type;
                                            final String type2 = comment.type;
                                            if (type == type2 || (type != null && type.equals(type2))) {
                                                final Long depth = this.depth;
                                                final Long depth2 = comment.depth;
                                                if (depth == depth2 || (depth != null && depth.equals(depth2))) {
                                                    final String content_type = this.content_type;
                                                    final String content_type2 = comment.content_type;
                                                    if (content_type == content_type2 || (content_type != null && content_type.equals(content_type2))) {
                                                        final Long last_edited_timestamp = this.last_edited_timestamp;
                                                        final Long last_edited_timestamp2 = comment.last_edited_timestamp;
                                                        boolean b2 = b;
                                                        if (last_edited_timestamp == last_edited_timestamp2) {
                                                            return b2;
                                                        }
                                                        if (last_edited_timestamp != null && last_edited_timestamp.equals(last_edited_timestamp2)) {
                                                            b2 = b;
                                                            return b2;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final String id = this.id;
        int hashCode = 0;
        int hashCode2;
        if (id == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = id.hashCode();
        }
        final String post_id = this.post_id;
        int hashCode3;
        if (post_id == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = post_id.hashCode();
        }
        final String parent_id = this.parent_id;
        int hashCode4;
        if (parent_id == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = parent_id.hashCode();
        }
        final String body_text = this.body_text;
        int hashCode5;
        if (body_text == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = body_text.hashCode();
        }
        final String author_id = this.author_id;
        int hashCode6;
        if (author_id == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = author_id.hashCode();
        }
        final Long number_gildings = this.number_gildings;
        int hashCode7;
        if (number_gildings == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = number_gildings.hashCode();
        }
        final Long score = this.score;
        int hashCode8;
        if (score == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = score.hashCode();
        }
        final Double upvote_ratio = this.upvote_ratio;
        int hashCode9;
        if (upvote_ratio == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = upvote_ratio.hashCode();
        }
        final Long created_timestamp = this.created_timestamp;
        int hashCode10;
        if (created_timestamp == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = created_timestamp.hashCode();
        }
        final String type = this.type;
        int hashCode11;
        if (type == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = type.hashCode();
        }
        final Long depth = this.depth;
        int hashCode12;
        if (depth == null) {
            hashCode12 = 0;
        }
        else {
            hashCode12 = depth.hashCode();
        }
        final String content_type = this.content_type;
        int hashCode13;
        if (content_type == null) {
            hashCode13 = 0;
        }
        else {
            hashCode13 = content_type.hashCode();
        }
        final Long last_edited_timestamp = this.last_edited_timestamp;
        if (last_edited_timestamp != null) {
            hashCode = last_edited_timestamp.hashCode();
        }
        return (((((((((((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode6) * -2128831035 ^ hashCode7) * -2128831035 ^ hashCode8) * -2128831035 ^ hashCode9) * -2128831035 ^ hashCode10) * -2128831035 ^ hashCode11) * -2128831035 ^ hashCode12) * -2128831035 ^ hashCode13) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("Comment{id=");
        k.append(this.id);
        k.append(", post_id=");
        k.append(this.post_id);
        k.append(", parent_id=");
        k.append(this.parent_id);
        k.append(", body_text=");
        k.append(this.body_text);
        k.append(", author_id=");
        k.append(this.author_id);
        k.append(", number_gildings=");
        k.append(this.number_gildings);
        k.append(", score=");
        k.append(this.score);
        k.append(", upvote_ratio=");
        k.append(this.upvote_ratio);
        k.append(", created_timestamp=");
        k.append(this.created_timestamp);
        k.append(", type=");
        k.append(this.type);
        k.append(", depth=");
        k.append(this.depth);
        k.append(", content_type=");
        k.append(this.content_type);
        k.append(", last_edited_timestamp=");
        return a.h(k, this.last_edited_timestamp, "}");
    }
    
    public void write(final e e) throws IOException {
        Comment.ADAPTER.write(e, (Object)this);
    }
}
