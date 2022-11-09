// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.tagging;

import ag0.a;
import ah2.f;
import com.reddit.domain.model.mod.RepeatMode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0007\b\tB\u0007\b\u0004¢\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\n\u000b\f¨\u0006\r" }, d2 = { "Lcom/reddit/domain/model/tagging/NewCommunityProgressButton;", "", "()V", "text", "", "getText", "()Ljava/lang/String;", "NewCommunityProgressCreatePostButton", "NewCommunityProgressShareButton", "NewCommunityProgressUrlButton", "Lcom/reddit/domain/model/tagging/NewCommunityProgressButton$NewCommunityProgressCreatePostButton;", "Lcom/reddit/domain/model/tagging/NewCommunityProgressButton$NewCommunityProgressShareButton;", "Lcom/reddit/domain/model/tagging/NewCommunityProgressButton$NewCommunityProgressUrlButton;", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public abstract class NewCommunityProgressButton
{
    private NewCommunityProgressButton() {
    }
    
    public abstract String getText();
    
    @Metadata(d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0007H\u00c6\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b" }, d2 = { "Lcom/reddit/domain/model/tagging/NewCommunityProgressButton$NewCommunityProgressCreatePostButton;", "Lcom/reddit/domain/model/tagging/NewCommunityProgressButton;", "text", "", "postTitle", "postBodyMarkdown", "postRepeat", "Lcom/reddit/domain/model/mod/RepeatMode;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/reddit/domain/model/mod/RepeatMode;)V", "getPostBodyMarkdown", "()Ljava/lang/String;", "getPostRepeat", "()Lcom/reddit/domain/model/mod/RepeatMode;", "getPostTitle", "getText", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class NewCommunityProgressCreatePostButton extends NewCommunityProgressButton
    {
        private final String postBodyMarkdown;
        private final RepeatMode postRepeat;
        private final String postTitle;
        private final String text;
        
        public NewCommunityProgressCreatePostButton(final String text, final String postTitle, final String postBodyMarkdown, final RepeatMode postRepeat) {
            f.f((Object)text, "text");
            f.f((Object)postTitle, "postTitle");
            f.f((Object)postBodyMarkdown, "postBodyMarkdown");
            f.f((Object)postRepeat, "postRepeat");
            super(null);
            this.text = text;
            this.postTitle = postTitle;
            this.postBodyMarkdown = postBodyMarkdown;
            this.postRepeat = postRepeat;
        }
        
        public final String component1() {
            return this.getText();
        }
        
        public final String component2() {
            return this.postTitle;
        }
        
        public final String component3() {
            return this.postBodyMarkdown;
        }
        
        public final RepeatMode component4() {
            return this.postRepeat;
        }
        
        public final NewCommunityProgressCreatePostButton copy(final String s, final String s2, final String s3, final RepeatMode repeatMode) {
            f.f((Object)s, "text");
            f.f((Object)s2, "postTitle");
            f.f((Object)s3, "postBodyMarkdown");
            f.f((Object)repeatMode, "postRepeat");
            return new NewCommunityProgressCreatePostButton(s, s2, s3, repeatMode);
        }
        
        @Override
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof NewCommunityProgressCreatePostButton)) {
                return false;
            }
            final NewCommunityProgressCreatePostButton newCommunityProgressCreatePostButton = (NewCommunityProgressCreatePostButton)o;
            return f.a((Object)this.getText(), (Object)newCommunityProgressCreatePostButton.getText()) && f.a((Object)this.postTitle, (Object)newCommunityProgressCreatePostButton.postTitle) && f.a((Object)this.postBodyMarkdown, (Object)newCommunityProgressCreatePostButton.postBodyMarkdown) && this.postRepeat == newCommunityProgressCreatePostButton.postRepeat;
        }
        
        public final String getPostBodyMarkdown() {
            return this.postBodyMarkdown;
        }
        
        public final RepeatMode getPostRepeat() {
            return this.postRepeat;
        }
        
        public final String getPostTitle() {
            return this.postTitle;
        }
        
        @Override
        public String getText() {
            return this.text;
        }
        
        @Override
        public int hashCode() {
            return this.postRepeat.hashCode() + a.f(this.postBodyMarkdown, a.f(this.postTitle, this.getText().hashCode() * 31, 31), 31);
        }
        
        @Override
        public String toString() {
            final StringBuilder k = a.k("NewCommunityProgressCreatePostButton(text=");
            k.append(this.getText());
            k.append(", postTitle=");
            k.append(this.postTitle);
            k.append(", postBodyMarkdown=");
            k.append(this.postBodyMarkdown);
            k.append(", postRepeat=");
            k.append(this.postRepeat);
            k.append(')');
            return k.toString();
        }
    }
    
    @Metadata(d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010" }, d2 = { "Lcom/reddit/domain/model/tagging/NewCommunityProgressButton$NewCommunityProgressShareButton;", "Lcom/reddit/domain/model/tagging/NewCommunityProgressButton;", "text", "", "(Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class NewCommunityProgressShareButton extends NewCommunityProgressButton
    {
        private final String text;
        
        public NewCommunityProgressShareButton(final String text) {
            f.f((Object)text, "text");
            super(null);
            this.text = text;
        }
        
        public final String component1() {
            return this.getText();
        }
        
        public final NewCommunityProgressShareButton copy(final String s) {
            f.f((Object)s, "text");
            return new NewCommunityProgressShareButton(s);
        }
        
        @Override
        public boolean equals(final Object o) {
            return this == o || (o instanceof NewCommunityProgressShareButton && f.a((Object)this.getText(), (Object)((NewCommunityProgressShareButton)o).getText()));
        }
        
        @Override
        public String getText() {
            return this.text;
        }
        
        @Override
        public int hashCode() {
            return this.getText().hashCode();
        }
        
        @Override
        public String toString() {
            final StringBuilder k = a.k("NewCommunityProgressShareButton(text=");
            k.append(this.getText());
            k.append(')');
            return k.toString();
        }
    }
    
    @Metadata(d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0003H\u00d6\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013" }, d2 = { "Lcom/reddit/domain/model/tagging/NewCommunityProgressButton$NewCommunityProgressUrlButton;", "Lcom/reddit/domain/model/tagging/NewCommunityProgressButton;", "text", "", "url", "(Ljava/lang/String;Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "getUrl", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class NewCommunityProgressUrlButton extends NewCommunityProgressButton
    {
        private final String text;
        private final String url;
        
        public NewCommunityProgressUrlButton(final String text, final String url) {
            f.f((Object)text, "text");
            f.f((Object)url, "url");
            super(null);
            this.text = text;
            this.url = url;
        }
        
        public final String component1() {
            return this.getText();
        }
        
        public final String component2() {
            return this.url;
        }
        
        public final NewCommunityProgressUrlButton copy(final String s, final String s2) {
            f.f((Object)s, "text");
            f.f((Object)s2, "url");
            return new NewCommunityProgressUrlButton(s, s2);
        }
        
        @Override
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof NewCommunityProgressUrlButton)) {
                return false;
            }
            final NewCommunityProgressUrlButton newCommunityProgressUrlButton = (NewCommunityProgressUrlButton)o;
            return f.a((Object)this.getText(), (Object)newCommunityProgressUrlButton.getText()) && f.a((Object)this.url, (Object)newCommunityProgressUrlButton.url);
        }
        
        @Override
        public String getText() {
            return this.text;
        }
        
        public final String getUrl() {
            return this.url;
        }
        
        @Override
        public int hashCode() {
            return this.url.hashCode() + this.getText().hashCode() * 31;
        }
        
        @Override
        public String toString() {
            final StringBuilder k = a.k("NewCommunityProgressUrlButton(text=");
            k.append(this.getText());
            k.append(", url=");
            return b.k(k, this.url, ')');
        }
    }
}
