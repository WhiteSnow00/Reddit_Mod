// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.model;

import b5.k;
import aq2.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ng2.e;
import mg2.l;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b\u0012\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b¢\u0006\u0004\b'\u0010(J\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0004\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0005\u001a\u00020\u0002H\u00c6\u0003J\u000f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u00c6\u0003J\u0012\u0010\t\u001a\u0004\u0018\u00010\bH\u00c6\u0003¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bH\u00c6\u0003Jb\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bH\u00c6\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0016\u001a\u00020\u0002H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0017H\u00d6\u0001J\u0013\u0010\u001a\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0012\u0010#\u001a\u0004\b\u0012\u0010\nR%\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b8\u0006¢\u0006\f\n\u0004\b\u0013\u0010$\u001a\u0004\b%\u0010&¨\u0006)" }, d2 = { "Lcom/reddit/domain/chat/model/SlashCommand;", "", "", "component1", "component2", "component3", "", "component4", "", "component5", "()Ljava/lang/Boolean;", "Lkotlin/Function1;", "Lcom/reddit/domain/chat/model/SlashCommandAction;", "component6", "id", "name", "description", "alias", "isError", "getMatchingCommandAction", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Lmg2/l;)Lcom/reddit/domain/chat/model/SlashCommand;", "toString", "", "hashCode", "other", "equals", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getName", "getDescription", "Ljava/util/List;", "getAlias", "()Ljava/util/List;", "Ljava/lang/Boolean;", "Lmg2/l;", "getGetMatchingCommandAction", "()Lmg2/l;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Lmg2/l;)V", "domain_release" }, k = 1, mv = { 1, 7, 1 })
public final class SlashCommand
{
    private final List<String> alias;
    private final String description;
    private final l<String, SlashCommandAction> getMatchingCommandAction;
    private final String id;
    private final Boolean isError;
    private final String name;
    
    public SlashCommand(final String id, final String name, final String description, final List<String> alias, final Boolean isError, final l<? super String, ? extends SlashCommandAction> getMatchingCommandAction) {
        e.f((Object)id, "id");
        e.f((Object)name, "name");
        e.f((Object)description, "description");
        e.f((Object)alias, "alias");
        e.f((Object)getMatchingCommandAction, "getMatchingCommandAction");
        this.id = id;
        this.name = name;
        this.description = description;
        this.alias = alias;
        this.isError = isError;
        this.getMatchingCommandAction = (l<String, SlashCommandAction>)getMatchingCommandAction;
        if (alias.isEmpty() ^ true) {
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
    
    public SlashCommand(final String s, final String s2, final String s3, final List list, Boolean false, final l l, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 0x10) != 0x0) {
            false = Boolean.FALSE;
        }
        this(s, s2, s3, list, false, (l<? super String, ? extends SlashCommandAction>)l);
    }
    
    public static SlashCommand copy$default(final SlashCommand slashCommand, String id, String name, String description, List alias, Boolean isError, l getMatchingCommandAction, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            id = slashCommand.id;
        }
        if ((n & 0x2) != 0x0) {
            name = slashCommand.name;
        }
        if ((n & 0x4) != 0x0) {
            description = slashCommand.description;
        }
        if ((n & 0x8) != 0x0) {
            alias = slashCommand.alias;
        }
        if ((n & 0x10) != 0x0) {
            isError = slashCommand.isError;
        }
        if ((n & 0x20) != 0x0) {
            getMatchingCommandAction = slashCommand.getMatchingCommandAction;
        }
        return slashCommand.copy(id, name, description, alias, isError, (l<? super String, ? extends SlashCommandAction>)getMatchingCommandAction);
    }
    
    public final String component1() {
        return this.id;
    }
    
    public final String component2() {
        return this.name;
    }
    
    public final String component3() {
        return this.description;
    }
    
    public final List<String> component4() {
        return this.alias;
    }
    
    public final Boolean component5() {
        return this.isError;
    }
    
    public final l<String, SlashCommandAction> component6() {
        return this.getMatchingCommandAction;
    }
    
    public final SlashCommand copy(final String s, final String s2, final String s3, final List<String> list, final Boolean b, final l<? super String, ? extends SlashCommandAction> l) {
        e.f((Object)s, "id");
        e.f((Object)s2, "name");
        e.f((Object)s3, "description");
        e.f((Object)list, "alias");
        e.f((Object)l, "getMatchingCommandAction");
        return new SlashCommand(s, s2, s3, list, b, l);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SlashCommand)) {
            return false;
        }
        final SlashCommand slashCommand = (SlashCommand)o;
        return e.a((Object)this.id, (Object)slashCommand.id) && e.a((Object)this.name, (Object)slashCommand.name) && e.a((Object)this.description, (Object)slashCommand.description) && e.a((Object)this.alias, (Object)slashCommand.alias) && e.a((Object)this.isError, (Object)slashCommand.isError) && e.a((Object)this.getMatchingCommandAction, (Object)slashCommand.getMatchingCommandAction);
    }
    
    public final List<String> getAlias() {
        return this.alias;
    }
    
    public final String getDescription() {
        return this.description;
    }
    
    public final l<String, SlashCommandAction> getGetMatchingCommandAction() {
        return this.getMatchingCommandAction;
    }
    
    public final String getId() {
        return this.id;
    }
    
    public final String getName() {
        return this.name;
    }
    
    @Override
    public int hashCode() {
        final int b = ph0.a.b((List)this.alias, a.e(this.description, a.e(this.name, this.id.hashCode() * 31, 31), 31), 31);
        final Boolean isError = this.isError;
        int hashCode;
        if (isError == null) {
            hashCode = 0;
        }
        else {
            hashCode = isError.hashCode();
        }
        return this.getMatchingCommandAction.hashCode() + (b + hashCode) * 31;
    }
    
    public final Boolean isError() {
        return this.isError;
    }
    
    @Override
    public String toString() {
        final StringBuilder t = a.t("SlashCommand(id=");
        t.append(this.id);
        t.append(", name=");
        t.append(this.name);
        t.append(", description=");
        t.append(this.description);
        t.append(", alias=");
        t.append(this.alias);
        t.append(", isError=");
        t.append(this.isError);
        t.append(", getMatchingCommandAction=");
        return k.n(t, (l)this.getMatchingCommandAction, ')');
    }
}
