// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.tagging;

import kj2.j;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ag0.a;
import ah2.f;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0002,-BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000e\u001a\u00020\u0003¢\u0006\u0002\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\u0007H\u00c6\u0003J\t\u0010!\u001a\u00020\tH\u00c6\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\t\u0010$\u001a\u00020\u0003H\u00c6\u0003J]\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010)\u001a\u00020*H\u00d6\u0001J\t\u0010+\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0011¨\u0006." }, d2 = { "Lcom/reddit/domain/model/tagging/NewCommunityProgressV2Card;", "", "id", "", "title", "bodyContentRichText", "status", "Lcom/reddit/domain/model/tagging/NewCommunityProgressV2Card$Status;", "progress", "Lcom/reddit/domain/model/tagging/CommunityCompletionProgress;", "button", "Lcom/reddit/domain/model/tagging/NewCommunityProgressButton;", "icon", "Lcom/reddit/domain/model/tagging/NewCommunityProgressV2Card$Icon;", "color", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/reddit/domain/model/tagging/NewCommunityProgressV2Card$Status;Lcom/reddit/domain/model/tagging/CommunityCompletionProgress;Lcom/reddit/domain/model/tagging/NewCommunityProgressButton;Lcom/reddit/domain/model/tagging/NewCommunityProgressV2Card$Icon;Ljava/lang/String;)V", "getBodyContentRichText", "()Ljava/lang/String;", "getButton", "()Lcom/reddit/domain/model/tagging/NewCommunityProgressButton;", "getColor", "getIcon", "()Lcom/reddit/domain/model/tagging/NewCommunityProgressV2Card$Icon;", "getId", "getProgress", "()Lcom/reddit/domain/model/tagging/CommunityCompletionProgress;", "getStatus", "()Lcom/reddit/domain/model/tagging/NewCommunityProgressV2Card$Status;", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "Icon", "Status", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class NewCommunityProgressV2Card
{
    private final String bodyContentRichText;
    private final NewCommunityProgressButton button;
    private final String color;
    private final Icon icon;
    private final String id;
    private final CommunityCompletionProgress progress;
    private final Status status;
    private final String title;
    
    public NewCommunityProgressV2Card(final String id, final String title, final String bodyContentRichText, final Status status, final CommunityCompletionProgress progress, final NewCommunityProgressButton button, final Icon icon, final String color) {
        f.f((Object)id, "id");
        f.f((Object)title, "title");
        f.f((Object)bodyContentRichText, "bodyContentRichText");
        f.f((Object)status, "status");
        f.f((Object)progress, "progress");
        f.f((Object)color, "color");
        this.id = id;
        this.title = title;
        this.bodyContentRichText = bodyContentRichText;
        this.status = status;
        this.progress = progress;
        this.button = button;
        this.icon = icon;
        this.color = color;
    }
    
    public final String component1() {
        return this.id;
    }
    
    public final String component2() {
        return this.title;
    }
    
    public final String component3() {
        return this.bodyContentRichText;
    }
    
    public final Status component4() {
        return this.status;
    }
    
    public final CommunityCompletionProgress component5() {
        return this.progress;
    }
    
    public final NewCommunityProgressButton component6() {
        return this.button;
    }
    
    public final Icon component7() {
        return this.icon;
    }
    
    public final String component8() {
        return this.color;
    }
    
    public final NewCommunityProgressV2Card copy(final String s, final String s2, final String s3, final Status status, final CommunityCompletionProgress communityCompletionProgress, final NewCommunityProgressButton newCommunityProgressButton, final Icon icon, final String s4) {
        f.f((Object)s, "id");
        f.f((Object)s2, "title");
        f.f((Object)s3, "bodyContentRichText");
        f.f((Object)status, "status");
        f.f((Object)communityCompletionProgress, "progress");
        f.f((Object)s4, "color");
        return new NewCommunityProgressV2Card(s, s2, s3, status, communityCompletionProgress, newCommunityProgressButton, icon, s4);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NewCommunityProgressV2Card)) {
            return false;
        }
        final NewCommunityProgressV2Card newCommunityProgressV2Card = (NewCommunityProgressV2Card)o;
        return f.a((Object)this.id, (Object)newCommunityProgressV2Card.id) && f.a((Object)this.title, (Object)newCommunityProgressV2Card.title) && f.a((Object)this.bodyContentRichText, (Object)newCommunityProgressV2Card.bodyContentRichText) && this.status == newCommunityProgressV2Card.status && f.a((Object)this.progress, (Object)newCommunityProgressV2Card.progress) && f.a((Object)this.button, (Object)newCommunityProgressV2Card.button) && this.icon == newCommunityProgressV2Card.icon && f.a((Object)this.color, (Object)newCommunityProgressV2Card.color);
    }
    
    public final String getBodyContentRichText() {
        return this.bodyContentRichText;
    }
    
    public final NewCommunityProgressButton getButton() {
        return this.button;
    }
    
    public final String getColor() {
        return this.color;
    }
    
    public final Icon getIcon() {
        return this.icon;
    }
    
    public final String getId() {
        return this.id;
    }
    
    public final CommunityCompletionProgress getProgress() {
        return this.progress;
    }
    
    public final Status getStatus() {
        return this.status;
    }
    
    public final String getTitle() {
        return this.title;
    }
    
    @Override
    public int hashCode() {
        final int f = a.f(this.bodyContentRichText, a.f(this.title, this.id.hashCode() * 31, 31), 31);
        final int hashCode = this.status.hashCode();
        final int hashCode2 = this.progress.hashCode();
        final NewCommunityProgressButton button = this.button;
        int hashCode3 = 0;
        int hashCode4;
        if (button == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = button.hashCode();
        }
        final Icon icon = this.icon;
        if (icon != null) {
            hashCode3 = icon.hashCode();
        }
        return this.color.hashCode() + (((hashCode2 + (hashCode + f) * 31) * 31 + hashCode4) * 31 + hashCode3) * 31;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("NewCommunityProgressV2Card(id=");
        k.append(this.id);
        k.append(", title=");
        k.append(this.title);
        k.append(", bodyContentRichText=");
        k.append(this.bodyContentRichText);
        k.append(", status=");
        k.append(this.status);
        k.append(", progress=");
        k.append(this.progress);
        k.append(", button=");
        k.append(this.button);
        k.append(", icon=");
        k.append(this.icon);
        k.append(", color=");
        return b.k(k, this.color, ')');
    }
    
    @Metadata(d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0001\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e" }, d2 = { "Lcom/reddit/domain/model/tagging/NewCommunityProgressV2Card$Icon;", "", "id", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getId", "()Ljava/lang/String;", "GENTLEMAN_SCHOLAR", "TOP_ANSWER", "ROCKET_SHARE", "HELPFUL_200", "HELPFUL", "CHAMPAGNE", "Companion", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public enum Icon
    {
        CHAMPAGNE("champagne");
        
        public static final Companion Companion;
        
        GENTLEMAN_SCHOLAR("gentleman_scholar"), 
        HELPFUL("helpful"), 
        HELPFUL_200("helpful_200"), 
        ROCKET_SHARE("rocket_share"), 
        TOP_ANSWER("top_answer");
        
        private final String id;
        
        static {
            Companion = new Companion(null);
        }
        
        private Icon(final String id) {
            this.id = id;
        }
        
        public final String getId() {
            return this.id;
        }
        
        @Metadata(d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007" }, d2 = { "Lcom/reddit/domain/model/tagging/NewCommunityProgressV2Card$Icon$Companion;", "", "()V", "fromString", "Lcom/reddit/domain/model/tagging/NewCommunityProgressV2Card$Icon;", "string", "", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
        public static final class Companion
        {
            private Companion() {
            }
            
            public final Icon fromString(final String s) {
                f.f((Object)s, "string");
                for (final Icon icon : Icon.values()) {
                    if (j.V1(icon.getId(), s, true)) {
                        return icon;
                    }
                }
                return null;
            }
        }
    }
    
    @Metadata(d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006" }, d2 = { "Lcom/reddit/domain/model/tagging/NewCommunityProgressV2Card$Status;", "", "(Ljava/lang/String;I)V", "INITIAL", "ACTIONED", "COMPLETED", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public enum Status
    {
        ACTIONED, 
        COMPLETED, 
        INITIAL;
    }
}
