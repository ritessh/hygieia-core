package com.capitalone.dashboard.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCloudInstance is a Querydsl query type for CloudInstance
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCloudInstance extends EntityPathBase<CloudInstance> {

    private static final long serialVersionUID = -1608625848L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCloudInstance cloudInstance = new QCloudInstance("cloudInstance");

    public final QBaseModel _super;

    public final StringPath accountNumber = createString("accountNumber");

    public final NumberPath<Integer> age = createNumber("age", Integer.class);

    public final StringPath autoScaleName = createString("autoScaleName");

    //inherited
    public final StringPath clientReference;

    public final NumberPath<Double> cpuUtilization = createNumber("cpuUtilization", Double.class);

    public final NumberPath<Double> diskRead = createNumber("diskRead", Double.class);

    public final NumberPath<Double> diskWrite = createNumber("diskWrite", Double.class);

    // inherited
    public final org.bson.types.QObjectId id;

    public final BooleanPath imageApproved = createBoolean("imageApproved");

    public final NumberPath<Long> imageExpirationDate = createNumber("imageExpirationDate", Long.class);

    public final StringPath imageId = createString("imageId");

    public final StringPath instanceId = createString("instanceId");

    public final StringPath instanceOwner = createString("instanceOwner");

    public final StringPath instanceType = createString("instanceType");

    public final BooleanPath isMonitored = createBoolean("isMonitored");

    public final BooleanPath isStopped = createBoolean("isStopped");

    public final BooleanPath isTagged = createBoolean("isTagged");

    public final StringPath lastAction = createString("lastAction");

    public final NumberPath<Long> lastUpdatedDate = createNumber("lastUpdatedDate", Long.class);

    public final BooleanPath monitored = createBoolean("monitored");

    public final NumberPath<Double> networkIn = createNumber("networkIn", Double.class);

    public final NumberPath<Double> networkOut = createNumber("networkOut", Double.class);

    public final StringPath privateDns = createString("privateDns");

    public final StringPath privateIp = createString("privateIp");

    public final StringPath publicDns = createString("publicDns");

    public final StringPath publicIp = createString("publicIp");

    public final StringPath rootDeviceName = createString("rootDeviceName");

    public final ListPath<String, StringPath> securityGroups = this.<String, StringPath>createList("securityGroups", String.class, StringPath.class, PathInits.DIRECT2);

    public final StringPath status = createString("status");

    public final BooleanPath stopped = createBoolean("stopped");

    public final StringPath subnetId = createString("subnetId");

    public final BooleanPath tagged = createBoolean("tagged");

    public final ListPath<NameValue, QNameValue> tags = this.<NameValue, QNameValue>createList("tags", NameValue.class, QNameValue.class, PathInits.DIRECT2);

    //inherited
    public final DateTimePath<java.util.Date> upsertTime;

    public final StringPath virtualNetworkId = createString("virtualNetworkId");

    public QCloudInstance(String variable) {
        this(CloudInstance.class, forVariable(variable), INITS);
    }

    public QCloudInstance(Path<? extends CloudInstance> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCloudInstance(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCloudInstance(PathMetadata metadata, PathInits inits) {
        this(CloudInstance.class, metadata, inits);
    }

    public QCloudInstance(Class<? extends CloudInstance> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QBaseModel(type, metadata, inits);
        this.clientReference = _super.clientReference;
        this.id = _super.id;
        this.upsertTime = _super.upsertTime;
    }

}

