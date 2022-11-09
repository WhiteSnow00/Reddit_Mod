// 
// Decompiled by Procyon v0.6.0
// 

package com.amazonaws.ivs.player;

import android.media.MediaDrm;
import java.util.UUID;
import java.util.EnumSet;

public enum ProtectionSystem
{
    PLAYREADY(UUID.fromString("9a04f079-9840-4286-ab92-e65be0885f95")), 
    WIDEVINE(UUID.fromString("edef8ba9-79d6-4ace-a3c8-27dcd51d21ed"));
    
    private static final EnumSet<ProtectionSystem> supported;
    private final UUID uuid;
    
    static {
        supported = EnumSet.noneOf(ProtectionSystem.class);
    }
    
    private ProtectionSystem(final UUID uuid) {
        this.uuid = uuid;
    }
    
    public static EnumSet<ProtectionSystem> getSupported() {
        final EnumSet<ProtectionSystem> supported = ProtectionSystem.supported;
        synchronized (supported) {
            if (supported.isEmpty()) {
                for (final ProtectionSystem protectionSystem : values()) {
                    if (MediaDrm.isCryptoSchemeSupported(protectionSystem.getUUID())) {
                        ProtectionSystem.supported.add(protectionSystem);
                    }
                }
            }
            return ProtectionSystem.supported;
        }
    }
    
    public static ProtectionSystem valueOf(final UUID uuid) {
        for (final ProtectionSystem protectionSystem : values()) {
            if (protectionSystem.getUUID().equals(uuid)) {
                return protectionSystem;
            }
        }
        return null;
    }
    
    public UUID getUUID() {
        return this.uuid;
    }
}
