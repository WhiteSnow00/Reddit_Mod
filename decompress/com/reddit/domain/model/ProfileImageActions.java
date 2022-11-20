// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import cg.d;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001d\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011" }, d2 = { "Lcom/reddit/domain/model/ProfileImageActions;", "", "type", "Lcom/reddit/domain/model/ProfileImageType;", "actions", "", "Lcom/reddit/domain/model/ProfileImageAction;", "(Ljava/lang/String;ILcom/reddit/domain/model/ProfileImageType;Ljava/util/List;)V", "getActions", "()Ljava/util/List;", "getType", "()Lcom/reddit/domain/model/ProfileImageType;", "CUSTOM_AVATAR_NO_SNOOVATAR", "CUSTOM_AVATAR_HAS_SNOOVATAR", "DEFAULT_AVATAR", "CUSTOM_BANNER", "DEFAULT_BANNER", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public enum ProfileImageActions
{
    private static final ProfileImageActions[] $VALUES;
    
    CUSTOM_AVATAR_HAS_SNOOVATAR(avatar, (List<? extends ProfileImageAction>)d.m3((Object[])new ProfileImageAction[] { ProfileImageAction.SNOOVATAR_EDIT, camera, library, restore_AVATAR })), 
    CUSTOM_AVATAR_NO_SNOOVATAR(avatar, (List<? extends ProfileImageAction>)d.m3((Object[])new ProfileImageAction[] { snoovatar_CREATE, camera, library, restore_AVATAR })), 
    CUSTOM_BANNER(banner, (List<? extends ProfileImageAction>)d.m3((Object[])new ProfileImageAction[] { camera, library, ProfileImageAction.REMOVE_BANNER })), 
    DEFAULT_AVATAR(avatar, (List<? extends ProfileImageAction>)d.m3((Object[])new ProfileImageAction[] { snoovatar_CREATE, camera, library })), 
    DEFAULT_BANNER(banner, (List<? extends ProfileImageAction>)d.m3((Object[])new ProfileImageAction[] { camera, library }));
    
    private final List<ProfileImageAction> actions;
    private final ProfileImageType type;
    
    private static final ProfileImageActions[] $values() {
        return new ProfileImageActions[] { ProfileImageActions.CUSTOM_AVATAR_NO_SNOOVATAR, ProfileImageActions.CUSTOM_AVATAR_HAS_SNOOVATAR, ProfileImageActions.DEFAULT_AVATAR, ProfileImageActions.CUSTOM_BANNER, ProfileImageActions.DEFAULT_BANNER };
    }
    
    static {
        final ProfileImageType avatar = ProfileImageType.AVATAR;
        final ProfileImageAction snoovatar_CREATE = ProfileImageAction.SNOOVATAR_CREATE;
        final ProfileImageAction camera = ProfileImageAction.CAMERA;
        final ProfileImageAction library = ProfileImageAction.LIBRARY;
        final ProfileImageAction restore_AVATAR = ProfileImageAction.RESTORE_AVATAR;
        final ProfileImageType banner = ProfileImageType.BANNER;
        $VALUES = $values();
    }
    
    private ProfileImageActions(final ProfileImageType type, final List<? extends ProfileImageAction> actions) {
        this.type = type;
        this.actions = (List<ProfileImageAction>)actions;
    }
    
    public final List<ProfileImageAction> getActions() {
        return this.actions;
    }
    
    public final ProfileImageType getType() {
        return this.type;
    }
}
