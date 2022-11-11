// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import ft.e;
import java.util.Collections;
import java.util.List;
import et.a;

public final class AFDSecond
{
    public static final a<AFDSecond, AFDSecond.AFDSecond$Builder> ADAPTER;
    public final Integer image_id;
    public final List<Integer> image_ids;
    public final String image_name;
    public final List<String> image_names;
    public final List<Integer> image_ranks;
    public final Integer image_set_id;
    public final String image_set_name;
    public final Long round_end_timestamp;
    public final Integer round_id;
    public final Long round_start_timestamp;
    public final List<Integer> vote_counts;
    public final Integer winning_image_id;
    public final String winning_image_name;
    
    static {
        ADAPTER = (a)new AFDSecond.AFDSecond$AFDSecondAdapter((AFDSecond$1)null);
    }
    
    private AFDSecond(final AFDSecond.AFDSecond$Builder afdSecond$Builder) {
        this.round_id = AFDSecond.AFDSecond$Builder.access$100(afdSecond$Builder);
        this.round_start_timestamp = AFDSecond.AFDSecond$Builder.access$200(afdSecond$Builder);
        this.round_end_timestamp = AFDSecond.AFDSecond$Builder.access$300(afdSecond$Builder);
        final List access$400 = AFDSecond.AFDSecond$Builder.access$400(afdSecond$Builder);
        final List<Integer> list = null;
        List<Integer> unmodifiableList;
        if (access$400 == null) {
            unmodifiableList = null;
        }
        else {
            unmodifiableList = Collections.unmodifiableList((List<? extends Integer>)AFDSecond.AFDSecond$Builder.access$400(afdSecond$Builder));
        }
        this.image_ids = unmodifiableList;
        List<String> unmodifiableList2;
        if (AFDSecond.AFDSecond$Builder.access$500(afdSecond$Builder) == null) {
            unmodifiableList2 = null;
        }
        else {
            unmodifiableList2 = Collections.unmodifiableList((List<? extends String>)AFDSecond.AFDSecond$Builder.access$500(afdSecond$Builder));
        }
        this.image_names = unmodifiableList2;
        List<Integer> unmodifiableList3;
        if (AFDSecond.AFDSecond$Builder.access$600(afdSecond$Builder) == null) {
            unmodifiableList3 = null;
        }
        else {
            unmodifiableList3 = Collections.unmodifiableList((List<? extends Integer>)AFDSecond.AFDSecond$Builder.access$600(afdSecond$Builder));
        }
        this.vote_counts = unmodifiableList3;
        this.image_id = AFDSecond.AFDSecond$Builder.access$700(afdSecond$Builder);
        this.image_name = AFDSecond.AFDSecond$Builder.access$800(afdSecond$Builder);
        List<Integer> unmodifiableList4;
        if (AFDSecond.AFDSecond$Builder.access$900(afdSecond$Builder) == null) {
            unmodifiableList4 = list;
        }
        else {
            unmodifiableList4 = Collections.unmodifiableList((List<? extends Integer>)AFDSecond.AFDSecond$Builder.access$900(afdSecond$Builder));
        }
        this.image_ranks = unmodifiableList4;
        this.winning_image_id = AFDSecond.AFDSecond$Builder.access$1000(afdSecond$Builder);
        this.winning_image_name = AFDSecond.AFDSecond$Builder.access$1100(afdSecond$Builder);
        this.image_set_name = AFDSecond.AFDSecond$Builder.access$1200(afdSecond$Builder);
        this.image_set_id = AFDSecond.AFDSecond$Builder.access$1300(afdSecond$Builder);
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
        if (!(o instanceof AFDSecond)) {
            return false;
        }
        final AFDSecond afdSecond = (AFDSecond)o;
        final Integer round_id = this.round_id;
        final Integer round_id2 = afdSecond.round_id;
        if (round_id == round_id2 || (round_id != null && round_id.equals(round_id2))) {
            final Long round_start_timestamp = this.round_start_timestamp;
            final Long round_start_timestamp2 = afdSecond.round_start_timestamp;
            if (round_start_timestamp == round_start_timestamp2 || (round_start_timestamp != null && round_start_timestamp.equals(round_start_timestamp2))) {
                final Long round_end_timestamp = this.round_end_timestamp;
                final Long round_end_timestamp2 = afdSecond.round_end_timestamp;
                if (round_end_timestamp == round_end_timestamp2 || (round_end_timestamp != null && round_end_timestamp.equals(round_end_timestamp2))) {
                    final List<Integer> image_ids = this.image_ids;
                    final List<Integer> image_ids2 = afdSecond.image_ids;
                    if (image_ids == image_ids2 || (image_ids != null && image_ids.equals(image_ids2))) {
                        final List<String> image_names = this.image_names;
                        final List<String> image_names2 = afdSecond.image_names;
                        if (image_names == image_names2 || (image_names != null && image_names.equals(image_names2))) {
                            final List<Integer> vote_counts = this.vote_counts;
                            final List<Integer> vote_counts2 = afdSecond.vote_counts;
                            if (vote_counts == vote_counts2 || (vote_counts != null && vote_counts.equals(vote_counts2))) {
                                final Integer image_id = this.image_id;
                                final Integer image_id2 = afdSecond.image_id;
                                if (image_id == image_id2 || (image_id != null && image_id.equals(image_id2))) {
                                    final String image_name = this.image_name;
                                    final String image_name2 = afdSecond.image_name;
                                    if (image_name == image_name2 || (image_name != null && image_name.equals(image_name2))) {
                                        final List<Integer> image_ranks = this.image_ranks;
                                        final List<Integer> image_ranks2 = afdSecond.image_ranks;
                                        if (image_ranks == image_ranks2 || (image_ranks != null && image_ranks.equals(image_ranks2))) {
                                            final Integer winning_image_id = this.winning_image_id;
                                            final Integer winning_image_id2 = afdSecond.winning_image_id;
                                            if (winning_image_id == winning_image_id2 || (winning_image_id != null && winning_image_id.equals(winning_image_id2))) {
                                                final String winning_image_name = this.winning_image_name;
                                                final String winning_image_name2 = afdSecond.winning_image_name;
                                                if (winning_image_name == winning_image_name2 || (winning_image_name != null && winning_image_name.equals(winning_image_name2))) {
                                                    final String image_set_name = this.image_set_name;
                                                    final String image_set_name2 = afdSecond.image_set_name;
                                                    if (image_set_name == image_set_name2 || (image_set_name != null && image_set_name.equals(image_set_name2))) {
                                                        final Integer image_set_id = this.image_set_id;
                                                        final Integer image_set_id2 = afdSecond.image_set_id;
                                                        boolean b2 = b;
                                                        if (image_set_id == image_set_id2) {
                                                            return b2;
                                                        }
                                                        if (image_set_id != null && image_set_id.equals(image_set_id2)) {
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
        final Integer round_id = this.round_id;
        int hashCode = 0;
        int hashCode2;
        if (round_id == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = round_id.hashCode();
        }
        final Long round_start_timestamp = this.round_start_timestamp;
        int hashCode3;
        if (round_start_timestamp == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = round_start_timestamp.hashCode();
        }
        final Long round_end_timestamp = this.round_end_timestamp;
        int hashCode4;
        if (round_end_timestamp == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = round_end_timestamp.hashCode();
        }
        final List<Integer> image_ids = this.image_ids;
        int hashCode5;
        if (image_ids == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = image_ids.hashCode();
        }
        final List<String> image_names = this.image_names;
        int hashCode6;
        if (image_names == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = image_names.hashCode();
        }
        final List<Integer> vote_counts = this.vote_counts;
        int hashCode7;
        if (vote_counts == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = vote_counts.hashCode();
        }
        final Integer image_id = this.image_id;
        int hashCode8;
        if (image_id == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = image_id.hashCode();
        }
        final String image_name = this.image_name;
        int hashCode9;
        if (image_name == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = image_name.hashCode();
        }
        final List<Integer> image_ranks = this.image_ranks;
        int hashCode10;
        if (image_ranks == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = image_ranks.hashCode();
        }
        final Integer winning_image_id = this.winning_image_id;
        int hashCode11;
        if (winning_image_id == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = winning_image_id.hashCode();
        }
        final String winning_image_name = this.winning_image_name;
        int hashCode12;
        if (winning_image_name == null) {
            hashCode12 = 0;
        }
        else {
            hashCode12 = winning_image_name.hashCode();
        }
        final String image_set_name = this.image_set_name;
        int hashCode13;
        if (image_set_name == null) {
            hashCode13 = 0;
        }
        else {
            hashCode13 = image_set_name.hashCode();
        }
        final Integer image_set_id = this.image_set_id;
        if (image_set_id != null) {
            hashCode = image_set_id.hashCode();
        }
        return (((((((((((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode6) * -2128831035 ^ hashCode7) * -2128831035 ^ hashCode8) * -2128831035 ^ hashCode9) * -2128831035 ^ hashCode10) * -2128831035 ^ hashCode11) * -2128831035 ^ hashCode12) * -2128831035 ^ hashCode13) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder r = a.r("AFDSecond{round_id=");
        r.append(this.round_id);
        r.append(", round_start_timestamp=");
        r.append(this.round_start_timestamp);
        r.append(", round_end_timestamp=");
        r.append(this.round_end_timestamp);
        r.append(", image_ids=");
        r.append(this.image_ids);
        r.append(", image_names=");
        r.append(this.image_names);
        r.append(", vote_counts=");
        r.append(this.vote_counts);
        r.append(", image_id=");
        r.append(this.image_id);
        r.append(", image_name=");
        r.append(this.image_name);
        r.append(", image_ranks=");
        r.append(this.image_ranks);
        r.append(", winning_image_id=");
        r.append(this.winning_image_id);
        r.append(", winning_image_name=");
        r.append(this.winning_image_name);
        r.append(", image_set_name=");
        r.append(this.image_set_name);
        r.append(", image_set_id=");
        r.append(this.image_set_id);
        r.append("}");
        return r.toString();
    }
    
    public void write(final e e) throws IOException {
        AFDSecond.ADAPTER.write(e, (Object)this);
    }
}
