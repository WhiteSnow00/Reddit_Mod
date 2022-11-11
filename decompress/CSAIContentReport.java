// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import kt.e;
import a2.b;
import jt.a;

public final class CSAIContentReport
{
    public static final a<CSAIContentReport, CSAIContentReport.CSAIContentReport$Builder> ADAPTER;
    public final Boolean confirmed_csai;
    public final String content_type;
    public final String content_url;
    public final String dest_queue_id;
    public final Long ncmec_report_number;
    public final String original_queue_id;
    public final String permalink;
    public final String removed_by_user_id;
    public final String removed_by_user_type;
    public final String reported_url;
    public final String reporter_id;
    public final String subreddit_id;
    public final String target_id;
    public final String target_type;
    public final String tracking_id;
    
    static {
        ADAPTER = (a)new CSAIContentReport.CSAIContentReport$CSAIContentReportAdapter((CSAIContentReport$1)null);
    }
    
    private CSAIContentReport(final CSAIContentReport.CSAIContentReport$Builder csaiContentReport$Builder) {
        this.reported_url = CSAIContentReport.CSAIContentReport$Builder.access$100(csaiContentReport$Builder);
        this.content_url = CSAIContentReport.CSAIContentReport$Builder.access$200(csaiContentReport$Builder);
        this.target_id = CSAIContentReport.CSAIContentReport$Builder.access$300(csaiContentReport$Builder);
        this.target_type = CSAIContentReport.CSAIContentReport$Builder.access$400(csaiContentReport$Builder);
        this.tracking_id = CSAIContentReport.CSAIContentReport$Builder.access$500(csaiContentReport$Builder);
        this.removed_by_user_type = CSAIContentReport.CSAIContentReport$Builder.access$600(csaiContentReport$Builder);
        this.content_type = CSAIContentReport.CSAIContentReport$Builder.access$700(csaiContentReport$Builder);
        this.removed_by_user_id = CSAIContentReport.CSAIContentReport$Builder.access$800(csaiContentReport$Builder);
        this.subreddit_id = CSAIContentReport.CSAIContentReport$Builder.access$900(csaiContentReport$Builder);
        this.original_queue_id = CSAIContentReport.CSAIContentReport$Builder.access$1000(csaiContentReport$Builder);
        this.dest_queue_id = CSAIContentReport.CSAIContentReport$Builder.access$1100(csaiContentReport$Builder);
        this.confirmed_csai = CSAIContentReport.CSAIContentReport$Builder.access$1200(csaiContentReport$Builder);
        this.ncmec_report_number = CSAIContentReport.CSAIContentReport$Builder.access$1300(csaiContentReport$Builder);
        this.reporter_id = CSAIContentReport.CSAIContentReport$Builder.access$1400(csaiContentReport$Builder);
        this.permalink = CSAIContentReport.CSAIContentReport$Builder.access$1500(csaiContentReport$Builder);
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
        if (!(o instanceof CSAIContentReport)) {
            return false;
        }
        final CSAIContentReport csaiContentReport = (CSAIContentReport)o;
        final String reported_url = this.reported_url;
        final String reported_url2 = csaiContentReport.reported_url;
        if (reported_url == reported_url2 || (reported_url != null && reported_url.equals(reported_url2))) {
            final String content_url = this.content_url;
            final String content_url2 = csaiContentReport.content_url;
            if (content_url == content_url2 || (content_url != null && content_url.equals(content_url2))) {
                final String target_id = this.target_id;
                final String target_id2 = csaiContentReport.target_id;
                if (target_id == target_id2 || (target_id != null && target_id.equals(target_id2))) {
                    final String target_type = this.target_type;
                    final String target_type2 = csaiContentReport.target_type;
                    if (target_type == target_type2 || (target_type != null && target_type.equals(target_type2))) {
                        final String tracking_id = this.tracking_id;
                        final String tracking_id2 = csaiContentReport.tracking_id;
                        if (tracking_id == tracking_id2 || (tracking_id != null && tracking_id.equals(tracking_id2))) {
                            final String removed_by_user_type = this.removed_by_user_type;
                            final String removed_by_user_type2 = csaiContentReport.removed_by_user_type;
                            if (removed_by_user_type == removed_by_user_type2 || (removed_by_user_type != null && removed_by_user_type.equals(removed_by_user_type2))) {
                                final String content_type = this.content_type;
                                final String content_type2 = csaiContentReport.content_type;
                                if (content_type == content_type2 || (content_type != null && content_type.equals(content_type2))) {
                                    final String removed_by_user_id = this.removed_by_user_id;
                                    final String removed_by_user_id2 = csaiContentReport.removed_by_user_id;
                                    if (removed_by_user_id == removed_by_user_id2 || (removed_by_user_id != null && removed_by_user_id.equals(removed_by_user_id2))) {
                                        final String subreddit_id = this.subreddit_id;
                                        final String subreddit_id2 = csaiContentReport.subreddit_id;
                                        if (subreddit_id == subreddit_id2 || (subreddit_id != null && subreddit_id.equals(subreddit_id2))) {
                                            final String original_queue_id = this.original_queue_id;
                                            final String original_queue_id2 = csaiContentReport.original_queue_id;
                                            if (original_queue_id == original_queue_id2 || (original_queue_id != null && original_queue_id.equals(original_queue_id2))) {
                                                final String dest_queue_id = this.dest_queue_id;
                                                final String dest_queue_id2 = csaiContentReport.dest_queue_id;
                                                if (dest_queue_id == dest_queue_id2 || (dest_queue_id != null && dest_queue_id.equals(dest_queue_id2))) {
                                                    final Boolean confirmed_csai = this.confirmed_csai;
                                                    final Boolean confirmed_csai2 = csaiContentReport.confirmed_csai;
                                                    if (confirmed_csai == confirmed_csai2 || (confirmed_csai != null && confirmed_csai.equals(confirmed_csai2))) {
                                                        final Long ncmec_report_number = this.ncmec_report_number;
                                                        final Long ncmec_report_number2 = csaiContentReport.ncmec_report_number;
                                                        if (ncmec_report_number == ncmec_report_number2 || (ncmec_report_number != null && ncmec_report_number.equals(ncmec_report_number2))) {
                                                            final String reporter_id = this.reporter_id;
                                                            final String reporter_id2 = csaiContentReport.reporter_id;
                                                            if (reporter_id == reporter_id2 || (reporter_id != null && reporter_id.equals(reporter_id2))) {
                                                                final String permalink = this.permalink;
                                                                final String permalink2 = csaiContentReport.permalink;
                                                                boolean b2 = b;
                                                                if (permalink == permalink2) {
                                                                    return b2;
                                                                }
                                                                if (permalink != null && permalink.equals(permalink2)) {
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
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final String reported_url = this.reported_url;
        int hashCode = 0;
        int hashCode2;
        if (reported_url == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = reported_url.hashCode();
        }
        final String content_url = this.content_url;
        int hashCode3;
        if (content_url == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = content_url.hashCode();
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
        final String tracking_id = this.tracking_id;
        int hashCode6;
        if (tracking_id == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = tracking_id.hashCode();
        }
        final String removed_by_user_type = this.removed_by_user_type;
        int hashCode7;
        if (removed_by_user_type == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = removed_by_user_type.hashCode();
        }
        final String content_type = this.content_type;
        int hashCode8;
        if (content_type == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = content_type.hashCode();
        }
        final String removed_by_user_id = this.removed_by_user_id;
        int hashCode9;
        if (removed_by_user_id == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = removed_by_user_id.hashCode();
        }
        final String subreddit_id = this.subreddit_id;
        int hashCode10;
        if (subreddit_id == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = subreddit_id.hashCode();
        }
        final String original_queue_id = this.original_queue_id;
        int hashCode11;
        if (original_queue_id == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = original_queue_id.hashCode();
        }
        final String dest_queue_id = this.dest_queue_id;
        int hashCode12;
        if (dest_queue_id == null) {
            hashCode12 = 0;
        }
        else {
            hashCode12 = dest_queue_id.hashCode();
        }
        final Boolean confirmed_csai = this.confirmed_csai;
        int hashCode13;
        if (confirmed_csai == null) {
            hashCode13 = 0;
        }
        else {
            hashCode13 = confirmed_csai.hashCode();
        }
        final Long ncmec_report_number = this.ncmec_report_number;
        int hashCode14;
        if (ncmec_report_number == null) {
            hashCode14 = 0;
        }
        else {
            hashCode14 = ncmec_report_number.hashCode();
        }
        final String reporter_id = this.reporter_id;
        int hashCode15;
        if (reporter_id == null) {
            hashCode15 = 0;
        }
        else {
            hashCode15 = reporter_id.hashCode();
        }
        final String permalink = this.permalink;
        if (permalink != null) {
            hashCode = permalink.hashCode();
        }
        return (((((((((((((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode6) * -2128831035 ^ hashCode7) * -2128831035 ^ hashCode8) * -2128831035 ^ hashCode9) * -2128831035 ^ hashCode10) * -2128831035 ^ hashCode11) * -2128831035 ^ hashCode12) * -2128831035 ^ hashCode13) * -2128831035 ^ hashCode14) * -2128831035 ^ hashCode15) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("CSAIContentReport{reported_url=");
        k.append(this.reported_url);
        k.append(", content_url=");
        k.append(this.content_url);
        k.append(", target_id=");
        k.append(this.target_id);
        k.append(", target_type=");
        k.append(this.target_type);
        k.append(", tracking_id=");
        k.append(this.tracking_id);
        k.append(", removed_by_user_type=");
        k.append(this.removed_by_user_type);
        k.append(", content_type=");
        k.append(this.content_type);
        k.append(", removed_by_user_id=");
        k.append(this.removed_by_user_id);
        k.append(", subreddit_id=");
        k.append(this.subreddit_id);
        k.append(", original_queue_id=");
        k.append(this.original_queue_id);
        k.append(", dest_queue_id=");
        k.append(this.dest_queue_id);
        k.append(", confirmed_csai=");
        k.append(this.confirmed_csai);
        k.append(", ncmec_report_number=");
        k.append(this.ncmec_report_number);
        k.append(", reporter_id=");
        k.append(this.reporter_id);
        k.append(", permalink=");
        return b.j(k, this.permalink, "}");
    }
    
    public void write(final e e) throws IOException {
        CSAIContentReport.ADAPTER.write(e, (Object)this);
    }
}
