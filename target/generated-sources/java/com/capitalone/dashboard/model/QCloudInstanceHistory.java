package com.capitalone.dashboard.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCloudInstanceHistory is a Querydsl query type for CloudInstanceHistory
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCloudInstanceHistory extends EntityPathBase<CloudInstanceHistory> {

    private static final long serialVersionUID = -1289639380L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCloudInstanceHistory cloudInstanceHistory = new QCloudInstanceHistory("cloudInstanceHistory");

    public final QBaseModel _super;

    public final StringPath accountNumber = createString("accountNumber");

    //inherited
    public final StringPath clientReference;

    public final NumberPath<Double> cpu = createNumber("cpu", Double.class);

    public final StringPath currency = createString("currency");

    public final NumberPath<Double> diskRead = createNumber("diskRead", Double.class);

    public final NumberPath<Double> diskWrite = createNumber("diskWrite", Double.class);

    public final NumberPath<Double> estimatedCharge = createNumber("estimatedCharge", Double.class);

    public final NumberPath<Integer> expiredImage = createNumber("expiredImage", Integer.class);

    // inherited
    public final org.bson.types.QObjectId id;

    public final NumberPath<Double> networkIn = createNumber("networkIn", Double.class);

    public final NumberPath<Double> networkOut = createNumber("networkOut", Double.class);

    public final NumberPath<Integer> nonTagged = createNumber("nonTagged", Integer.class);

    public final NumberPath<Integer> stopped = createNumber("stopped", Integer.class);

    public final NumberPath<Long> time = createNumber("time", Long.class);

    public final NumberPath<Integer> total = createNumber("total", Integer.class);

    //inherited
    public final DateTimePath<java.util.Date> upsertTime;

    public QCloudInstanceHistory(String variable) {
        this(CloudInstanceHistory.class, forVariable(variable), INITS);
    }

    public QCloudInstanceHistory(Path<? extends CloudInstanceHistory> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCloudInstanceHistory(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCloudInstanceHistory(PathMetadata metadata, PathInits inits) {
        this(CloudInstanceHistory.class, metadata, inits);
    }

    public QCloudInstanceHistory(Class<? extends CloudInstanceHistory> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QBaseModel(type, metadata, inits);
        this.clientReference = _super.clientReference;
        this.id = _super.id;
        this.upsertTime = _super.upsertTime;
    }

}

