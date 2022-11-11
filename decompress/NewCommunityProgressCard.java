// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.tagging;

import ak0.m;
import ag0.a;
import ah2.f;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u00c6\u0003JU\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u00c6\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010!\u001a\u00020\"H\u00d6\u0001J\t\u0010#\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006$" }, d2 = { "Lcom/reddit/domain/model/tagging/NewCommunityProgressCard;", "", "id", "", "name", "title", "bodyText", "icon", "color", "buttons", "", "Lcom/reddit/domain/model/tagging/NewCommunityProgressButton;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getBodyText", "()Ljava/lang/String;", "getButtons", "()Ljava/util/List;", "getColor", "getIcon", "getId", "getName", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class NewCommunityProgressCard
{
    private final String bodyText;
    private final List<NewCommunityProgressButton> buttons;
    private final String color;
    private final String icon;
    private final String id;
    private final String name;
    private final String title;
    
    public NewCommunityProgressCard(final String id, final String name, final String title, final String bodyText, final String icon, final String color, final List<? extends NewCommunityProgressButton> buttons) {
        f.f((Object)id, "id");
        f.f((Object)name, "name");
        f.f((Object)title, "title");
        f.f((Object)bodyText, "bodyText");
        f.f((Object)icon, "icon");
        f.f((Object)color, "color");
        f.f((Object)buttons, "buttons");
        this.id = id;
        this.name = name;
        this.title = title;
        this.bodyText = bodyText;
        this.icon = icon;
        this.color = color;
        this.buttons = (List<NewCommunityProgressButton>)buttons;
    }
    
    public final String component1() {
        return this.id;
    }
    
    public final String component2() {
        return this.name;
    }
    
    public final String component3() {
        return this.title;
    }
    
    public final String component4() {
        return this.bodyText;
    }
    
    public final String component5() {
        return this.icon;
    }
    
    public final String component6() {
        return this.color;
    }
    
    public final List<NewCommunityProgressButton> component7() {
        return this.buttons;
    }
    
    public final NewCommunityProgressCard copy(final String s, final String s2, final String s3, final String s4, final String s5, final String s6, final List<? extends NewCommunityProgressButton> list) {
        f.f((Object)s, "id");
        f.f((Object)s2, "name");
        f.f((Object)s3, "title");
        f.f((Object)s4, "bodyText");
        f.f((Object)s5, "icon");
        f.f((Object)s6, "color");
        f.f((Object)list, "buttons");
        return new NewCommunityProgressCard(s, s2, s3, s4, s5, s6, list);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NewCommunityProgressCard)) {
            return false;
        }
        final NewCommunityProgressCard newCommunityProgressCard = (NewCommunityProgressCard)o;
        return f.a((Object)this.id, (Object)newCommunityProgressCard.id) && f.a((Object)this.name, (Object)newCommunityProgressCard.name) && f.a((Object)this.title, (Object)newCommunityProgressCard.title) && f.a((Object)this.bodyText, (Object)newCommunityProgressCard.bodyText) && f.a((Object)this.icon, (Object)newCommunityProgressCard.icon) && f.a((Object)this.color, (Object)newCommunityProgressCard.color) && f.a((Object)this.buttons, (Object)newCommunityProgressCard.buttons);
    }
    
    public final String getBodyText() {
        return this.bodyText;
    }
    
    public final List<NewCommunityProgressButton> getButtons() {
        return this.buttons;
    }
    
    public final String getColor() {
        return this.color;
    }
    
    public final String getIcon() {
        return this.icon;
    }
    
    public final String getId() {
        return this.id;
    }
    
    public final String getName() {
        return this.name;
    }
    
    public final String getTitle() {
        return this.title;
    }
    
    @Override
    public int hashCode() {
        return this.buttons.hashCode() + a.f(this.color, a.f(this.icon, a.f(this.bodyText, a.f(this.title, a.f(this.name, this.id.hashCode() * 31, 31), 31), 31), 31), 31);
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("NewCommunityProgressCard(id=");
        k.append(this.id);
        k.append(", name=");
        k.append(this.name);
        k.append(", title=");
        k.append(this.title);
        k.append(", bodyText=");
        k.append(this.bodyText);
        k.append(", icon=");
        k.append(this.icon);
        k.append(", color=");
        k.append(this.color);
        k.append(", buttons=");
        return m.n(k, (List)this.buttons, ')');
    }
}
