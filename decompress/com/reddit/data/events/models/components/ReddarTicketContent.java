// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import ft.e;
import et.a;

public final class ReddarTicketContent
{
    public static final a<ReddarTicketContent, ReddarTicketContent.ReddarTicketContent$Builder> ADAPTER;
    public final String content_type;
    public final String hash;
    public final String hash_trigger_source;
    public final String hash_type;
    public final String id;
    public final Boolean post_nsfw;
    public final Boolean removed_by_moderator;
    public final String reported_url;
    public final String status;
    public final String status_reason;
    public final Long target_created_timestamp;
    public final String target_id;
    public final String target_type;
    
    static {
        ADAPTER = (a)new ReddarTicketContent.ReddarTicketContent$ReddarTicketContentAdapter((ReddarTicketContent$1)null);
    }
    
    private ReddarTicketContent(final ReddarTicketContent.ReddarTicketContent$Builder reddarTicketContent$Builder) {
        this.id = ReddarTicketContent.ReddarTicketContent$Builder.access$100(reddarTicketContent$Builder);
        this.reported_url = ReddarTicketContent.ReddarTicketContent$Builder.access$200(reddarTicketContent$Builder);
        this.target_id = ReddarTicketContent.ReddarTicketContent$Builder.access$300(reddarTicketContent$Builder);
        this.target_type = ReddarTicketContent.ReddarTicketContent$Builder.access$400(reddarTicketContent$Builder);
        this.status = ReddarTicketContent.ReddarTicketContent$Builder.access$500(reddarTicketContent$Builder);
        this.status_reason = ReddarTicketContent.ReddarTicketContent$Builder.access$600(reddarTicketContent$Builder);
        this.post_nsfw = ReddarTicketContent.ReddarTicketContent$Builder.access$700(reddarTicketContent$Builder);
        this.removed_by_moderator = ReddarTicketContent.ReddarTicketContent$Builder.access$800(reddarTicketContent$Builder);
        this.content_type = ReddarTicketContent.ReddarTicketContent$Builder.access$900(reddarTicketContent$Builder);
        this.target_created_timestamp = ReddarTicketContent.ReddarTicketContent$Builder.access$1000(reddarTicketContent$Builder);
        this.hash = ReddarTicketContent.ReddarTicketContent$Builder.access$1100(reddarTicketContent$Builder);
        this.hash_type = ReddarTicketContent.ReddarTicketContent$Builder.access$1200(reddarTicketContent$Builder);
        this.hash_trigger_source = ReddarTicketContent.ReddarTicketContent$Builder.access$1300(reddarTicketContent$Builder);
    }
    
    public ReddarTicketContent(final ReddarTicketContent.ReddarTicketContent$Builder reddarTicketContent$Builder, final ReddarTicketContent$1 object) {
        this(reddarTicketContent$Builder);
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
        if (!(o instanceof ReddarTicketContent)) {
            return false;
        }
        final ReddarTicketContent reddarTicketContent = (ReddarTicketContent)o;
        final String id = this.id;
        final String id2 = reddarTicketContent.id;
        if (id == id2 || (id != null && id.equals(id2))) {
            final String reported_url = this.reported_url;
            final String reported_url2 = reddarTicketContent.reported_url;
            if (reported_url == reported_url2 || (reported_url != null && reported_url.equals(reported_url2))) {
                final String target_id = this.target_id;
                final String target_id2 = reddarTicketContent.target_id;
                if (target_id == target_id2 || (target_id != null && target_id.equals(target_id2))) {
                    final String target_type = this.target_type;
                    final String target_type2 = reddarTicketContent.target_type;
                    if (target_type == target_type2 || (target_type != null && target_type.equals(target_type2))) {
                        final String status = this.status;
                        final String status2 = reddarTicketContent.status;
                        if (status == status2 || (status != null && status.equals(status2))) {
                            final String status_reason = this.status_reason;
                            final String status_reason2 = reddarTicketContent.status_reason;
                            if (status_reason == status_reason2 || (status_reason != null && status_reason.equals(status_reason2))) {
                                final Boolean post_nsfw = this.post_nsfw;
                                final Boolean post_nsfw2 = reddarTicketContent.post_nsfw;
                                if (post_nsfw == post_nsfw2 || (post_nsfw != null && post_nsfw.equals(post_nsfw2))) {
                                    final Boolean removed_by_moderator = this.removed_by_moderator;
                                    final Boolean removed_by_moderator2 = reddarTicketContent.removed_by_moderator;
                                    if (removed_by_moderator == removed_by_moderator2 || (removed_by_moderator != null && removed_by_moderator.equals(removed_by_moderator2))) {
                                        final String content_type = this.content_type;
                                        final String content_type2 = reddarTicketContent.content_type;
                                        if (content_type == content_type2 || (content_type != null && content_type.equals(content_type2))) {
                                            final Long target_created_timestamp = this.target_created_timestamp;
                                            final Long target_created_timestamp2 = reddarTicketContent.target_created_timestamp;
                                            if (target_created_timestamp == target_created_timestamp2 || (target_created_timestamp != null && target_created_timestamp.equals(target_created_timestamp2))) {
                                                final String hash = this.hash;
                                                final String hash2 = reddarTicketContent.hash;
                                                if (hash == hash2 || (hash != null && hash.equals(hash2))) {
                                                    final String hash_type = this.hash_type;
                                                    final String hash_type2 = reddarTicketContent.hash_type;
                                                    if (hash_type == hash_type2 || (hash_type != null && hash_type.equals(hash_type2))) {
                                                        final String hash_trigger_source = this.hash_trigger_source;
                                                        final String hash_trigger_source2 = reddarTicketContent.hash_trigger_source;
                                                        boolean b2 = b;
                                                        if (hash_trigger_source == hash_trigger_source2) {
                                                            return b2;
                                                        }
                                                        if (hash_trigger_source != null && hash_trigger_source.equals(hash_trigger_source2)) {
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
        final String reported_url = this.reported_url;
        int hashCode3;
        if (reported_url == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = reported_url.hashCode();
        }
        final String target_id = this.target_id;
        int hashCode4;
        if (target_id == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = target_id.hashCode();
        }
        final String target_type = this.target_type;
        int hashCode5;
        if (target_type == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = target_type.hashCode();
        }
        final String status = this.status;
        int hashCode6;
        if (status == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = status.hashCode();
        }
        final String status_reason = this.status_reason;
        int hashCode7;
        if (status_reason == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = status_reason.hashCode();
        }
        final Boolean post_nsfw = this.post_nsfw;
        int hashCode8;
        if (post_nsfw == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = post_nsfw.hashCode();
        }
        final Boolean removed_by_moderator = this.removed_by_moderator;
        int hashCode9;
        if (removed_by_moderator == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = removed_by_moderator.hashCode();
        }
        final String content_type = this.content_type;
        int hashCode10;
        if (content_type == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = content_type.hashCode();
        }
        final Long target_created_timestamp = this.target_created_timestamp;
        int hashCode11;
        if (target_created_timestamp == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = target_created_timestamp.hashCode();
        }
        final String hash = this.hash;
        int hashCode12;
        if (hash == null) {
            hashCode12 = 0;
        }
        else {
            hashCode12 = hash.hashCode();
        }
        final String hash_type = this.hash_type;
        int hashCode13;
        if (hash_type == null) {
            hashCode13 = 0;
        }
        else {
            hashCode13 = hash_type.hashCode();
        }
        final String hash_trigger_source = this.hash_trigger_source;
        if (hash_trigger_source != null) {
            hashCode = hash_trigger_source.hashCode();
        }
        return (((((((((((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode6) * -2128831035 ^ hashCode7) * -2128831035 ^ hashCode8) * -2128831035 ^ hashCode9) * -2128831035 ^ hashCode10) * -2128831035 ^ hashCode11) * -2128831035 ^ hashCode12) * -2128831035 ^ hashCode13) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder t = a.t("ReddarTicketContent{id=");
        t.append(this.id);
        t.append(", reported_url=");
        t.append(this.reported_url);
        t.append(", target_id=");
        t.append(this.target_id);
        t.append(", target_type=");
        t.append(this.target_type);
        t.append(", status=");
        t.append(this.status);
        t.append(", status_reason=");
        t.append(this.status_reason);
        t.append(", post_nsfw=");
        t.append(this.post_nsfw);
        t.append(", removed_by_moderator=");
        t.append(this.removed_by_moderator);
        t.append(", content_type=");
        t.append(this.content_type);
        t.append(", target_created_timestamp=");
        t.append(this.target_created_timestamp);
        t.append(", hash=");
        t.append(this.hash);
        t.append(", hash_type=");
        t.append(this.hash_type);
        t.append(", hash_trigger_source=");
        return ph0.a.f(t, this.hash_trigger_source, "}");
    }
    
    public void write(final e e) throws IOException {
        ReddarTicketContent.ADAPTER.write(e, (Object)this);
    }
}
