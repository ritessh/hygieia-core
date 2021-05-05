package com.capitalone.dashboard.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCloudVirtualNetwork is a Querydsl query type for CloudVirtualNetwork
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCloudVirtualNetwork extends EntityPathBase<CloudVirtualNetwork> {

    private static final long serialVersionUID = 982715158L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCloudVirtualNetwork cloudVirtualNetwork = new QCloudVirtualNetwork("cloudVirtualNetwork");

    public final QBaseModel _super;

    public final StringPath accountNumber = createString("accountNumber");

    public final StringPath cidrBlock = createString("cidrBlock");

    //inherited
    public final StringPath clientReference;

    public final org.bson.types.QObjectId collectorItemId;

    public final NumberPath<Long> creationDate = createNumber("creationDate", Long.class);

    public final BooleanPath defaultNetwork = createBoolean("defaultNetwork");

    // inherited
    public final org.bson.types.QObjectId id;

    public final NumberPath<Long> lastUpdateDate = createNumber("lastUpdateDate", Long.class);

    public final StringPath state = createString("state");

    public final MapPath<String, String, StringPath> tags = this.<String, String, StringPath>createMap("tags", String.class, String.class, StringPath.class);

    //inherited
    public final DateTimePath<java.util.Date> upsertTime;

    public final StringPath virtualNetworkId = createString("virtualNetworkId");

    public QCloudVirtualNetwork(String variable) {
        this(CloudVirtualNetwork.class, forVariable(variable), INITS);
    }

    public QCloudVirtualNetwork(Path<? extends CloudVirtualNetwork> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCloudVirtualNetwork(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCloudVirtualNetwork(PathMetadata metadata, PathInits inits) {
        this(CloudVirtualNetwork.class, metadata, inits);
    }

    public QCloudVirtualNetwork(Class<? extends CloudVirtualNetwork> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QBaseModel(type, metadata, inits);
        this.clientReference = _super.clientReference;
        this.collectorItemId = inits.isInitialized("collectorItemId") ? new org.bson.types.QObjectId(forProperty("collectorItemId")) : null;
        this.id = _super.id;
        this.upsertTime = _super.upsertTime;
    }

}

