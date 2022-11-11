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

public final class BulkActionJob
{
    public static final a<BulkActionJob, BulkActionJob.BulkActionJob$Builder> ADAPTER;
    public final List<String> actions;
    public final String bigquery_job_id;
    public final String id;
    public final String reason;
    public final Boolean requires_manual_review;
    public final String status;
    public final Integer target_count;
    public final Integer target_limit;
    public final String target_type;
    public final List<String> targets;
    public final String user_id;
    
    static {
        ADAPTER = (a)new BulkActionJob.BulkActionJob$BulkActionJobAdapter((BulkActionJob$1)null);
    }
    
    private BulkActionJob(final BulkActionJob.BulkActionJob$Builder bulkActionJob$Builder) {
        this.id = BulkActionJob.BulkActionJob$Builder.access$100(bulkActionJob$Builder);
        this.bigquery_job_id = BulkActionJob.BulkActionJob$Builder.access$200(bulkActionJob$Builder);
        this.reason = BulkActionJob.BulkActionJob$Builder.access$300(bulkActionJob$Builder);
        final List access$400 = BulkActionJob.BulkActionJob$Builder.access$400(bulkActionJob$Builder);
        final List<String> list = null;
        List<String> unmodifiableList;
        if (access$400 == null) {
            unmodifiableList = null;
        }
        else {
            unmodifiableList = Collections.unmodifiableList((List<? extends String>)BulkActionJob.BulkActionJob$Builder.access$400(bulkActionJob$Builder));
        }
        this.actions = unmodifiableList;
        this.target_type = BulkActionJob.BulkActionJob$Builder.access$500(bulkActionJob$Builder);
        this.target_count = BulkActionJob.BulkActionJob$Builder.access$600(bulkActionJob$Builder);
        this.target_limit = BulkActionJob.BulkActionJob$Builder.access$700(bulkActionJob$Builder);
        this.status = BulkActionJob.BulkActionJob$Builder.access$800(bulkActionJob$Builder);
        this.requires_manual_review = BulkActionJob.BulkActionJob$Builder.access$900(bulkActionJob$Builder);
        this.user_id = BulkActionJob.BulkActionJob$Builder.access$1000(bulkActionJob$Builder);
        List<String> unmodifiableList2;
        if (BulkActionJob.BulkActionJob$Builder.access$1100(bulkActionJob$Builder) == null) {
            unmodifiableList2 = list;
        }
        else {
            unmodifiableList2 = Collections.unmodifiableList((List<? extends String>)BulkActionJob.BulkActionJob$Builder.access$1100(bulkActionJob$Builder));
        }
        this.targets = unmodifiableList2;
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
        if (!(o instanceof BulkActionJob)) {
            return false;
        }
        final BulkActionJob bulkActionJob = (BulkActionJob)o;
        final String id = this.id;
        final String id2 = bulkActionJob.id;
        if (id == id2 || id.equals(id2)) {
            final String bigquery_job_id = this.bigquery_job_id;
            final String bigquery_job_id2 = bulkActionJob.bigquery_job_id;
            if (bigquery_job_id == bigquery_job_id2 || (bigquery_job_id != null && bigquery_job_id.equals(bigquery_job_id2))) {
                final String reason = this.reason;
                final String reason2 = bulkActionJob.reason;
                if (reason == reason2 || (reason != null && reason.equals(reason2))) {
                    final List<String> actions = this.actions;
                    final List<String> actions2 = bulkActionJob.actions;
                    if (actions == actions2 || (actions != null && actions.equals(actions2))) {
                        final String target_type = this.target_type;
                        final String target_type2 = bulkActionJob.target_type;
                        if (target_type == target_type2 || (target_type != null && target_type.equals(target_type2))) {
                            final Integer target_count = this.target_count;
                            final Integer target_count2 = bulkActionJob.target_count;
                            if (target_count == target_count2 || (target_count != null && target_count.equals(target_count2))) {
                                final Integer target_limit = this.target_limit;
                                final Integer target_limit2 = bulkActionJob.target_limit;
                                if (target_limit == target_limit2 || (target_limit != null && target_limit.equals(target_limit2))) {
                                    final String status = this.status;
                                    final String status2 = bulkActionJob.status;
                                    if (status == status2 || (status != null && status.equals(status2))) {
                                        final Boolean requires_manual_review = this.requires_manual_review;
                                        final Boolean requires_manual_review2 = bulkActionJob.requires_manual_review;
                                        if (requires_manual_review == requires_manual_review2 || (requires_manual_review != null && requires_manual_review.equals(requires_manual_review2))) {
                                            final String user_id = this.user_id;
                                            final String user_id2 = bulkActionJob.user_id;
                                            if (user_id == user_id2 || (user_id != null && user_id.equals(user_id2))) {
                                                final List<String> targets = this.targets;
                                                final List<String> targets2 = bulkActionJob.targets;
                                                boolean b2 = b;
                                                if (targets == targets2) {
                                                    return b2;
                                                }
                                                if (targets != null && targets.equals(targets2)) {
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
        return false;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.id.hashCode();
        final String bigquery_job_id = this.bigquery_job_id;
        int hashCode2 = 0;
        int hashCode3;
        if (bigquery_job_id == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = bigquery_job_id.hashCode();
        }
        final String reason = this.reason;
        int hashCode4;
        if (reason == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = reason.hashCode();
        }
        final List<String> actions = this.actions;
        int hashCode5;
        if (actions == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = actions.hashCode();
        }
        final String target_type = this.target_type;
        int hashCode6;
        if (target_type == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = target_type.hashCode();
        }
        final Integer target_count = this.target_count;
        int hashCode7;
        if (target_count == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = target_count.hashCode();
        }
        final Integer target_limit = this.target_limit;
        int hashCode8;
        if (target_limit == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = target_limit.hashCode();
        }
        final String status = this.status;
        int hashCode9;
        if (status == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = status.hashCode();
        }
        final Boolean requires_manual_review = this.requires_manual_review;
        int hashCode10;
        if (requires_manual_review == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = requires_manual_review.hashCode();
        }
        final String user_id = this.user_id;
        int hashCode11;
        if (user_id == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = user_id.hashCode();
        }
        final List<String> targets = this.targets;
        if (targets != null) {
            hashCode2 = targets.hashCode();
        }
        return (((((((((((hashCode ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode6) * -2128831035 ^ hashCode7) * -2128831035 ^ hashCode8) * -2128831035 ^ hashCode9) * -2128831035 ^ hashCode10) * -2128831035 ^ hashCode11) * -2128831035 ^ hashCode2) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("BulkActionJob{id=");
        k.append(this.id);
        k.append(", bigquery_job_id=");
        k.append(this.bigquery_job_id);
        k.append(", reason=");
        k.append(this.reason);
        k.append(", actions=");
        k.append(this.actions);
        k.append(", target_type=");
        k.append(this.target_type);
        k.append(", target_count=");
        k.append(this.target_count);
        k.append(", target_limit=");
        k.append(this.target_limit);
        k.append(", status=");
        k.append(this.status);
        k.append(", requires_manual_review=");
        k.append(this.requires_manual_review);
        k.append(", user_id=");
        k.append(this.user_id);
        k.append(", targets=");
        return n.r(k, (List)this.targets, "}");
    }
    
    public void write(final e e) throws IOException {
        BulkActionJob.ADAPTER.write(e, (Object)this);
    }
}
