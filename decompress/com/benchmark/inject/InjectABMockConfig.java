// 
// Decompiled by Procyon v0.6.0
// 

package com.benchmark.inject;

import com.bytedance.ies.abmock.debugtool.mock.IMockComponent$HostInfo;
import java.util.Arrays;
import X.0II;
import java.util.Map;
import X.0NG;
import X.0NI;
import X.0NE;
import java.util.Iterator;
import com.benchmark.serializer.ScopeSerializer;
import com.benchmark.entity.Scope;
import com.benchmark.serializer.LanguageSerializer;
import com.benchmark.entity.Language;
import com.benchmark.serializer.GroupSerializer;
import com.benchmark.entity.Group;
import java.lang.reflect.Type;
import com.benchmark.serializer.ABMockSerializer;
import com.google.gson.e;
import com.bytedance.covode.number.Covode;
import com.benchmark.entity.ABMockModel;
import java.util.List;
import com.google.gson.Gson;
import com.bytedance.ies.abmock.debugtool.mock.IMockComponent;

public class InjectABMockConfig implements IMockComponent
{
    public static StringBuilder abmockModelJsonBuilder;
    public static String injectJson;
    public static int[] repoNameList;
    public Gson mGson;
    public int mHostId;
    public List<ABMockModel> mMockModels;
    
    static {
        Covode.recordClassIndex(2949);
        InjectABMockConfig.injectJson = "[]";
    }
    
    public InjectABMockConfig() {
        this.mHostId = 100001;
        final e e = new e();
        e.LIZ((Type)ABMockModel.class, (Object)new ABMockSerializer());
        e.LIZ((Type)Group.class, (Object)new GroupSerializer());
        e.LIZ((Type)Language.class, (Object)new LanguageSerializer());
        e.LIZ((Type)Scope.class, (Object)new ScopeSerializer());
        this.mGson = e.LIZIZ();
    }
    
    private Object getABMockModelDefaultValue(final ABMockModel abMockModel) {
        if (abMockModel.filedTypeName.equals("int")) {
            return abMockModel.groups.get(0).value.LJI();
        }
        if (abMockModel.filedTypeName.equals("long")) {
            return abMockModel.groups.get(0).value.LJFF();
        }
        if (abMockModel.filedTypeName.equals("float")) {
            return abMockModel.groups.get(0).value.LJ();
        }
        if (abMockModel.filedTypeName.equals("boolean")) {
            return abMockModel.groups.get(0).value.LJIIJ();
        }
        return abMockModel.groups.get(0).value.LIZJ();
    }
    
    private ABMockModel getMatchModel(final String s) {
        final List<ABMockModel> mMockModels = this.mMockModels;
        if (mMockModels == null) {
            return null;
        }
        if (mMockModels.isEmpty()) {
            return null;
        }
        for (final ABMockModel abMockModel : this.mMockModels) {
            if (abMockModel.key.equals(s)) {
                return abMockModel;
            }
        }
        return null;
    }
    
    public Object get(final String s) {
        if (!0NE.LIZ()) {
            return null;
        }
        final ABMockModel matchModel = this.getMatchModel(s);
        if (matchModel == null) {
            return null;
        }
        final int[] repoNameList = InjectABMockConfig.repoNameList;
        final int length = repoNameList.length;
        int i = 0;
        while (i < length) {
            final 0NG liz = 0NI.LIZ().LIZ(repoNameList[i]);
            if (liz.LIZ(s)) {
                if (matchModel.filedTypeName.equals("int")) {
                    return liz.LIZ(s, matchModel.groups.get(0).value.LJI());
                }
                if (matchModel.filedTypeName.equals("long")) {
                    return liz.LIZ(s, matchModel.groups.get(0).value.LJFF());
                }
                if (matchModel.filedTypeName.equals("float")) {
                    return liz.LIZ(s, matchModel.groups.get(0).value.LJ());
                }
                if (matchModel.filedTypeName.equals("boolean")) {
                    return liz.LIZ(s, matchModel.groups.get(0).value.LJIIJ());
                }
                return liz.LIZ(s, matchModel.groups.get(0).value.LIZJ());
            }
            else {
                ++i;
            }
        }
        return this.getABMockModelDefaultValue(matchModel);
    }
    
    public Map<String, Object> getExtendInfo(final String s) {
        return null;
    }
    
    public Class<?> getFiledType(final String s) {
        final ABMockModel matchModel = this.getMatchModel(s);
        if (matchModel == null) {
            return null;
        }
        if (matchModel.filedTypeName.equals("int")) {
            return Integer.TYPE;
        }
        if (matchModel.filedTypeName.equals("long")) {
            return Long.TYPE;
        }
        if (matchModel.filedTypeName.equals("float")) {
            return Float.TYPE;
        }
        if (matchModel.filedTypeName.equals("boolean")) {
            return Boolean.TYPE;
        }
        if (matchModel.filedTypeName.equals("java.lang.String")) {
            return String.class;
        }
        try {
            return Class.forName(matchModel.filedTypeName);
        }
        catch (final ClassNotFoundException ex) {
            0II.LIZ(ex);
            return null;
        }
    }
    
    public int getHostId() {
        return this.mHostId;
    }
    
    public String getInjectConfig() {
        final StringBuilder abmockModelJsonBuilder = InjectABMockConfig.abmockModelJsonBuilder;
        if (abmockModelJsonBuilder != null) {
            InjectABMockConfig.injectJson = abmockModelJsonBuilder.toString();
        }
        if (InjectABMockConfig.injectJson.length() > 4) {
            final List<ABMockModel> list = Arrays.asList((ABMockModel[])this.mGson.LIZ(InjectABMockConfig.injectJson, (Class)ABMockModel[].class));
            this.mMockModels = list;
            for (final ABMockModel abMockModel : list) {
                if (!abMockModel.filedTypeName.equals("int") && !abMockModel.filedTypeName.equals("long") && !abMockModel.filedTypeName.equals("float") && !abMockModel.filedTypeName.equals("boolean") && !abMockModel.filedTypeName.equals("java.lang.String")) {
                    try {
                        abMockModel.groups.get(0).value = this.mGson.LIZ((Object)Class.forName(abMockModel.filedTypeName).getConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]));
                    }
                    catch (final Exception ex) {
                        0II.LIZ(ex);
                    }
                }
            }
            InjectABMockConfig.injectJson = this.mGson.LIZIZ((Object)this.mMockModels);
        }
        return InjectABMockConfig.injectJson;
    }
    
    public IMockComponent$HostInfo hostInfo() {
        return (IMockComponent$HostInfo)new IMockComponent$HostInfo() {
            static {
                Covode.recordClassIndex(2950);
            }
            
            public final String chineseDesc() {
                return "ByteBench";
            }
            
            public final String englishDesc() {
                return "ByteBench";
            }
            
            public final int hostId() {
                return InjectABMockConfig.this.mHostId;
            }
        };
    }
    
    public String mockInfoListJson() {
        return this.getInjectConfig();
    }
}
