// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import al0.g7;
import kotlin.jvm.internal.DefaultConstructorMarker;
import sg2.e;
import java.util.List;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b!\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t¢\u0006\u0002\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\tH\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0007H\u00c6\u0003J\t\u0010\"\u001a\u00020\tH\u00c6\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u007f\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000e\u001a\u00020\tH\u00c6\u0001J\u0013\u0010(\u001a\u00020\t2\b\u0010)\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010*\u001a\u00020+H\u00d6\u0001J\t\u0010,\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011R\u0011\u0010\u000e\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016¨\u0006-" }, d2 = { "Lcom/reddit/domain/model/SiteRuleFlow;", "", "reasonTextToShow", "", "reasonText", "nextStepHeader", "nextStepReasons", "", "fileComplaint", "", "complaintUrl", "complaintPrompt", "complaintPageTitle", "complaintButtonText", "requestCrisisSupport", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getComplaintButtonText", "()Ljava/lang/String;", "getComplaintPageTitle", "getComplaintPrompt", "getComplaintUrl", "getFileComplaint", "()Z", "getNextStepHeader", "getNextStepReasons", "()Ljava/util/List;", "getReasonText", "getReasonTextToShow", "getRequestCrisisSupport", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class SiteRuleFlow
{
    private final String complaintButtonText;
    private final String complaintPageTitle;
    private final String complaintPrompt;
    private final String complaintUrl;
    private final boolean fileComplaint;
    private final String nextStepHeader;
    private final List<SiteRuleFlow> nextStepReasons;
    private final String reasonText;
    private final String reasonTextToShow;
    private final boolean requestCrisisSupport;
    
    public SiteRuleFlow(final String reasonTextToShow, final String reasonText, final String nextStepHeader, final List<SiteRuleFlow> nextStepReasons, final boolean fileComplaint, final String complaintUrl, final String complaintPrompt, final String complaintPageTitle, final String complaintButtonText, final boolean requestCrisisSupport) {
        e.f((Object)reasonTextToShow, "reasonTextToShow");
        e.f((Object)reasonText, "reasonText");
        this.reasonTextToShow = reasonTextToShow;
        this.reasonText = reasonText;
        this.nextStepHeader = nextStepHeader;
        this.nextStepReasons = nextStepReasons;
        this.fileComplaint = fileComplaint;
        this.complaintUrl = complaintUrl;
        this.complaintPrompt = complaintPrompt;
        this.complaintPageTitle = complaintPageTitle;
        this.complaintButtonText = complaintButtonText;
        this.requestCrisisSupport = requestCrisisSupport;
    }
    
    public final String component1() {
        return this.reasonTextToShow;
    }
    
    public final boolean component10() {
        return this.requestCrisisSupport;
    }
    
    public final String component2() {
        return this.reasonText;
    }
    
    public final String component3() {
        return this.nextStepHeader;
    }
    
    public final List<SiteRuleFlow> component4() {
        return this.nextStepReasons;
    }
    
    public final boolean component5() {
        return this.fileComplaint;
    }
    
    public final String component6() {
        return this.complaintUrl;
    }
    
    public final String component7() {
        return this.complaintPrompt;
    }
    
    public final String component8() {
        return this.complaintPageTitle;
    }
    
    public final String component9() {
        return this.complaintButtonText;
    }
    
    public final SiteRuleFlow copy(final String s, final String s2, final String s3, final List<SiteRuleFlow> list, final boolean b, final String s4, final String s5, final String s6, final String s7, final boolean b2) {
        e.f((Object)s, "reasonTextToShow");
        e.f((Object)s2, "reasonText");
        return new SiteRuleFlow(s, s2, s3, list, b, s4, s5, s6, s7, b2);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SiteRuleFlow)) {
            return false;
        }
        final SiteRuleFlow siteRuleFlow = (SiteRuleFlow)o;
        return e.a((Object)this.reasonTextToShow, (Object)siteRuleFlow.reasonTextToShow) && e.a((Object)this.reasonText, (Object)siteRuleFlow.reasonText) && e.a((Object)this.nextStepHeader, (Object)siteRuleFlow.nextStepHeader) && e.a((Object)this.nextStepReasons, (Object)siteRuleFlow.nextStepReasons) && this.fileComplaint == siteRuleFlow.fileComplaint && e.a((Object)this.complaintUrl, (Object)siteRuleFlow.complaintUrl) && e.a((Object)this.complaintPrompt, (Object)siteRuleFlow.complaintPrompt) && e.a((Object)this.complaintPageTitle, (Object)siteRuleFlow.complaintPageTitle) && e.a((Object)this.complaintButtonText, (Object)siteRuleFlow.complaintButtonText) && this.requestCrisisSupport == siteRuleFlow.requestCrisisSupport;
    }
    
    public final String getComplaintButtonText() {
        return this.complaintButtonText;
    }
    
    public final String getComplaintPageTitle() {
        return this.complaintPageTitle;
    }
    
    public final String getComplaintPrompt() {
        return this.complaintPrompt;
    }
    
    public final String getComplaintUrl() {
        return this.complaintUrl;
    }
    
    public final boolean getFileComplaint() {
        return this.fileComplaint;
    }
    
    public final String getNextStepHeader() {
        return this.nextStepHeader;
    }
    
    public final List<SiteRuleFlow> getNextStepReasons() {
        return this.nextStepReasons;
    }
    
    public final String getReasonText() {
        return this.reasonText;
    }
    
    public final String getReasonTextToShow() {
        return this.reasonTextToShow;
    }
    
    public final boolean getRequestCrisisSupport() {
        return this.requestCrisisSupport;
    }
    
    @Override
    public int hashCode() {
        final int c = b.c(this.reasonText, this.reasonTextToShow.hashCode() * 31, 31);
        final String nextStepHeader = this.nextStepHeader;
        int hashCode = 0;
        int hashCode2;
        if (nextStepHeader == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = nextStepHeader.hashCode();
        }
        final List<SiteRuleFlow> nextStepReasons = this.nextStepReasons;
        int hashCode3;
        if (nextStepReasons == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = nextStepReasons.hashCode();
        }
        final int fileComplaint = this.fileComplaint ? 1 : 0;
        int n = 1;
        int n2 = fileComplaint;
        if (fileComplaint != 0) {
            n2 = 1;
        }
        final String complaintUrl = this.complaintUrl;
        int hashCode4;
        if (complaintUrl == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = complaintUrl.hashCode();
        }
        final String complaintPrompt = this.complaintPrompt;
        int hashCode5;
        if (complaintPrompt == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = complaintPrompt.hashCode();
        }
        final String complaintPageTitle = this.complaintPageTitle;
        int hashCode6;
        if (complaintPageTitle == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = complaintPageTitle.hashCode();
        }
        final String complaintButtonText = this.complaintButtonText;
        if (complaintButtonText != null) {
            hashCode = complaintButtonText.hashCode();
        }
        final int requestCrisisSupport = this.requestCrisisSupport ? 1 : 0;
        if (requestCrisisSupport == 0) {
            n = requestCrisisSupport;
        }
        return (((((((c + hashCode2) * 31 + hashCode3) * 31 + n2) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode) * 31 + n;
    }
    
    @Override
    public String toString() {
        final StringBuilder r = a.r("SiteRuleFlow(reasonTextToShow=");
        r.append(this.reasonTextToShow);
        r.append(", reasonText=");
        r.append(this.reasonText);
        r.append(", nextStepHeader=");
        r.append(this.nextStepHeader);
        r.append(", nextStepReasons=");
        r.append(this.nextStepReasons);
        r.append(", fileComplaint=");
        r.append(this.fileComplaint);
        r.append(", complaintUrl=");
        r.append(this.complaintUrl);
        r.append(", complaintPrompt=");
        r.append(this.complaintPrompt);
        r.append(", complaintPageTitle=");
        r.append(this.complaintPageTitle);
        r.append(", complaintButtonText=");
        r.append(this.complaintButtonText);
        r.append(", requestCrisisSupport=");
        return g7.m(r, this.requestCrisisSupport, ')');
    }
}
