package com.netflix.vms.transformer.hollowinput;

import com.netflix.hollow.api.objects.delegate.HollowObjectAbstractDelegate;
import com.netflix.hollow.core.read.dataaccess.HollowObjectTypeDataAccess;
import com.netflix.hollow.core.schema.HollowObjectSchema;

@SuppressWarnings("all")
public class RightsContractAssetDelegateLookupImpl extends HollowObjectAbstractDelegate implements RightsContractAssetDelegate {

    private final RightsContractAssetTypeAPI typeAPI;

    public RightsContractAssetDelegateLookupImpl(RightsContractAssetTypeAPI typeAPI) {
        this.typeAPI = typeAPI;
    }

    public int getBcp47CodeOrdinal(int ordinal) {
        return typeAPI.getBcp47CodeOrdinal(ordinal);
    }

    public int getAssetTypeOrdinal(int ordinal) {
        return typeAPI.getAssetTypeOrdinal(ordinal);
    }

    public RightsContractAssetTypeAPI getTypeAPI() {
        return typeAPI;
    }

    @Override
    public HollowObjectSchema getSchema() {
        return typeAPI.getTypeDataAccess().getSchema();
    }

    @Override
    public HollowObjectTypeDataAccess getTypeDataAccess() {
        return typeAPI.getTypeDataAccess();
    }

}