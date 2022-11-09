// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import kt.e;
import a2.b;
import java.util.Collections;
import java.util.List;
import jt.a;

public final class ScheduledPost
{
    public static final a<ScheduledPost, ScheduledPost.ScheduledPost$Builder> ADAPTER;
    public final Long created_timestamp;
    public final String creator_user_id;
    public final Long id;
    public final Boolean is_recurring;
    public final String last_modified_user_id;
    public final String milestone_type;
    public final Integer number_recurrences;
    public final String recurring_frequency;
    public final List<String> recurring_interval_period;
    public final Integer recurring_intervals;
    public final Long submission_timestamp;
    public final String submitted_post_id;
    public final String timezone;
    
    static {
        ADAPTER = (a)new ScheduledPost.ScheduledPost$ScheduledPostAdapter((ScheduledPost$1)null);
    }
    
    private ScheduledPost(final ScheduledPost.ScheduledPost$Builder scheduledPost$Builder) {
        this.id = ScheduledPost.ScheduledPost$Builder.access$100(scheduledPost$Builder);
        this.creator_user_id = ScheduledPost.ScheduledPost$Builder.access$200(scheduledPost$Builder);
        this.last_modified_user_id = ScheduledPost.ScheduledPost$Builder.access$300(scheduledPost$Builder);
        this.created_timestamp = ScheduledPost.ScheduledPost$Builder.access$400(scheduledPost$Builder);
        this.submission_timestamp = ScheduledPost.ScheduledPost$Builder.access$500(scheduledPost$Builder);
        this.timezone = ScheduledPost.ScheduledPost$Builder.access$600(scheduledPost$Builder);
        this.is_recurring = ScheduledPost.ScheduledPost$Builder.access$700(scheduledPost$Builder);
        this.recurring_frequency = ScheduledPost.ScheduledPost$Builder.access$800(scheduledPost$Builder);
        this.recurring_intervals = ScheduledPost.ScheduledPost$Builder.access$900(scheduledPost$Builder);
        List<String> unmodifiableList;
        if (ScheduledPost.ScheduledPost$Builder.access$1000(scheduledPost$Builder) == null) {
            unmodifiableList = null;
        }
        else {
            unmodifiableList = Collections.unmodifiableList((List<? extends String>)ScheduledPost.ScheduledPost$Builder.access$1000(scheduledPost$Builder));
        }
        this.recurring_interval_period = unmodifiableList;
        this.number_recurrences = ScheduledPost.ScheduledPost$Builder.access$1100(scheduledPost$Builder);
        this.milestone_type = ScheduledPost.ScheduledPost$Builder.access$1200(scheduledPost$Builder);
        this.submitted_post_id = ScheduledPost.ScheduledPost$Builder.access$1300(scheduledPost$Builder);
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
        if (!(o instanceof ScheduledPost)) {
            return false;
        }
        final ScheduledPost scheduledPost = (ScheduledPost)o;
        final Long id = this.id;
        final Long id2 = scheduledPost.id;
        if (id == id2 || (id != null && id.equals(id2))) {
            final String creator_user_id = this.creator_user_id;
            final String creator_user_id2 = scheduledPost.creator_user_id;
            if (creator_user_id == creator_user_id2 || (creator_user_id != null && creator_user_id.equals(creator_user_id2))) {
                final String last_modified_user_id = this.last_modified_user_id;
                final String last_modified_user_id2 = scheduledPost.last_modified_user_id;
                if (last_modified_user_id == last_modified_user_id2 || (last_modified_user_id != null && last_modified_user_id.equals(last_modified_user_id2))) {
                    final Long created_timestamp = this.created_timestamp;
                    final Long created_timestamp2 = scheduledPost.created_timestamp;
                    if (created_timestamp == created_timestamp2 || (created_timestamp != null && created_timestamp.equals(created_timestamp2))) {
                        final Long submission_timestamp = this.submission_timestamp;
                        final Long submission_timestamp2 = scheduledPost.submission_timestamp;
                        if (submission_timestamp == submission_timestamp2 || (submission_timestamp != null && submission_timestamp.equals(submission_timestamp2))) {
                            final String timezone = this.timezone;
                            final String timezone2 = scheduledPost.timezone;
                            if (timezone == timezone2 || (timezone != null && timezone.equals(timezone2))) {
                                final Boolean is_recurring = this.is_recurring;
                                final Boolean is_recurring2 = scheduledPost.is_recurring;
                                if (is_recurring == is_recurring2 || (is_recurring != null && is_recurring.equals(is_recurring2))) {
                                    final String recurring_frequency = this.recurring_frequency;
                                    final String recurring_frequency2 = scheduledPost.recurring_frequency;
                                    if (recurring_frequency == recurring_frequency2 || (recurring_frequency != null && recurring_frequency.equals(recurring_frequency2))) {
                                        final Integer recurring_intervals = this.recurring_intervals;
                                        final Integer recurring_intervals2 = scheduledPost.recurring_intervals;
                                        if (recurring_intervals == recurring_intervals2 || (recurring_intervals != null && recurring_intervals.equals(recurring_intervals2))) {
                                            final List<String> recurring_interval_period = this.recurring_interval_period;
                                            final List<String> recurring_interval_period2 = scheduledPost.recurring_interval_period;
                                            if (recurring_interval_period == recurring_interval_period2 || (recurring_interval_period != null && recurring_interval_period.equals(recurring_interval_period2))) {
                                                final Integer number_recurrences = this.number_recurrences;
                                                final Integer number_recurrences2 = scheduledPost.number_recurrences;
                                                if (number_recurrences == number_recurrences2 || (number_recurrences != null && number_recurrences.equals(number_recurrences2))) {
                                                    final String milestone_type = this.milestone_type;
                                                    final String milestone_type2 = scheduledPost.milestone_type;
                                                    if (milestone_type == milestone_type2 || (milestone_type != null && milestone_type.equals(milestone_type2))) {
                                                        final String submitted_post_id = this.submitted_post_id;
                                                        final String submitted_post_id2 = scheduledPost.submitted_post_id;
                                                        boolean b2 = b;
                                                        if (submitted_post_id == submitted_post_id2) {
                                                            return b2;
                                                        }
                                                        if (submitted_post_id != null && submitted_post_id.equals(submitted_post_id2)) {
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
        final Long id = this.id;
        int hashCode = 0;
        int hashCode2;
        if (id == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = id.hashCode();
        }
        final String creator_user_id = this.creator_user_id;
        int hashCode3;
        if (creator_user_id == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = creator_user_id.hashCode();
        }
        final String last_modified_user_id = this.last_modified_user_id;
        int hashCode4;
        if (last_modified_user_id == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = last_modified_user_id.hashCode();
        }
        final Long created_timestamp = this.created_timestamp;
        int hashCode5;
        if (created_timestamp == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = created_timestamp.hashCode();
        }
        final Long submission_timestamp = this.submission_timestamp;
        int hashCode6;
        if (submission_timestamp == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = submission_timestamp.hashCode();
        }
        final String timezone = this.timezone;
        int hashCode7;
        if (timezone == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = timezone.hashCode();
        }
        final Boolean is_recurring = this.is_recurring;
        int hashCode8;
        if (is_recurring == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = is_recurring.hashCode();
        }
        final String recurring_frequency = this.recurring_frequency;
        int hashCode9;
        if (recurring_frequency == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = recurring_frequency.hashCode();
        }
        final Integer recurring_intervals = this.recurring_intervals;
        int hashCode10;
        if (recurring_intervals == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = recurring_intervals.hashCode();
        }
        final List<String> recurring_interval_period = this.recurring_interval_period;
        int hashCode11;
        if (recurring_interval_period == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = recurring_interval_period.hashCode();
        }
        final Integer number_recurrences = this.number_recurrences;
        int hashCode12;
        if (number_recurrences == null) {
            hashCode12 = 0;
        }
        else {
            hashCode12 = number_recurrences.hashCode();
        }
        final String milestone_type = this.milestone_type;
        int hashCode13;
        if (milestone_type == null) {
            hashCode13 = 0;
        }
        else {
            hashCode13 = milestone_type.hashCode();
        }
        final String submitted_post_id = this.submitted_post_id;
        if (submitted_post_id != null) {
            hashCode = submitted_post_id.hashCode();
        }
        return (((((((((((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode6) * -2128831035 ^ hashCode7) * -2128831035 ^ hashCode8) * -2128831035 ^ hashCode9) * -2128831035 ^ hashCode10) * -2128831035 ^ hashCode11) * -2128831035 ^ hashCode12) * -2128831035 ^ hashCode13) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("ScheduledPost{id=");
        k.append(this.id);
        k.append(", creator_user_id=");
        k.append(this.creator_user_id);
        k.append(", last_modified_user_id=");
        k.append(this.last_modified_user_id);
        k.append(", created_timestamp=");
        k.append(this.created_timestamp);
        k.append(", submission_timestamp=");
        k.append(this.submission_timestamp);
        k.append(", timezone=");
        k.append(this.timezone);
        k.append(", is_recurring=");
        k.append(this.is_recurring);
        k.append(", recurring_frequency=");
        k.append(this.recurring_frequency);
        k.append(", recurring_intervals=");
        k.append(this.recurring_intervals);
        k.append(", recurring_interval_period=");
        k.append(this.recurring_interval_period);
        k.append(", number_recurrences=");
        k.append(this.number_recurrences);
        k.append(", milestone_type=");
        k.append(this.milestone_type);
        k.append(", submitted_post_id=");
        return b.j(k, this.submitted_post_id, "}");
    }
    
    public void write(final e e) throws IOException {
        ScheduledPost.ADAPTER.write(e, (Object)this);
    }
}
