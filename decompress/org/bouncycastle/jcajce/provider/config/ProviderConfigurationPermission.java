// 
// Decompiled by Procyon v0.6.0
// 

package org.bouncycastle.jcajce.provider.config;

import java.security.Permission;
import java.util.StringTokenizer;
import rm2.h;
import java.security.BasicPermission;

public class ProviderConfigurationPermission extends BasicPermission
{
    private final String actions;
    private final int permissionMask;
    
    public ProviderConfigurationPermission(final String s) {
        super(s);
        this.actions = "all";
        this.permissionMask = 63;
    }
    
    public ProviderConfigurationPermission(final String s, String nextToken) {
        super(s, nextToken);
        this.actions = nextToken;
        final StringTokenizer stringTokenizer = new StringTokenizer(h.c(nextToken), " ,");
        int permissionMask = 0;
        while (stringTokenizer.hasMoreTokens()) {
            nextToken = stringTokenizer.nextToken();
            if (nextToken.equals("threadlocalecimplicitlyca")) {
                permissionMask |= 0x1;
            }
            else if (nextToken.equals("ecimplicitlyca")) {
                permissionMask |= 0x2;
            }
            else if (nextToken.equals("threadlocaldhdefaultparams")) {
                permissionMask |= 0x4;
            }
            else if (nextToken.equals("dhdefaultparams")) {
                permissionMask |= 0x8;
            }
            else if (nextToken.equals("acceptableeccurves")) {
                permissionMask |= 0x10;
            }
            else if (nextToken.equals("additionalecparameters")) {
                permissionMask |= 0x20;
            }
            else {
                if (!nextToken.equals("all")) {
                    continue;
                }
                permissionMask |= 0x3F;
            }
        }
        if (permissionMask != 0) {
            this.permissionMask = permissionMask;
            return;
        }
        throw new IllegalArgumentException("unknown permissions passed to mask");
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof ProviderConfigurationPermission) {
            final ProviderConfigurationPermission providerConfigurationPermission = (ProviderConfigurationPermission)o;
            if (this.permissionMask != providerConfigurationPermission.permissionMask || !this.getName().equals(providerConfigurationPermission.getName())) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public String getActions() {
        return this.actions;
    }
    
    @Override
    public int hashCode() {
        return this.getName().hashCode() + this.permissionMask;
    }
    
    @Override
    public boolean implies(final Permission permission) {
        final boolean b = permission instanceof ProviderConfigurationPermission;
        boolean b2 = false;
        if (!b) {
            return false;
        }
        if (!this.getName().equals(permission.getName())) {
            return false;
        }
        final ProviderConfigurationPermission providerConfigurationPermission = (ProviderConfigurationPermission)permission;
        final int permissionMask = this.permissionMask;
        final int permissionMask2 = providerConfigurationPermission.permissionMask;
        if ((permissionMask & permissionMask2) == permissionMask2) {
            b2 = true;
        }
        return b2;
    }
}
