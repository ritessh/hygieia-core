package com.capitalone.dashboard.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QFeatureHistory is a Querydsl query type for FeatureHistory
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QFeatureHistory extends EntityPathBase<FeatureHistory> {

    private static final long serialVersionUID = -544256736L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QFeatureHistory featureHistory = new QFeatureHistory("featureHistory");

    public final QBaseModel _super;

    public final StringPath changeDate = createString("changeDate");

    //inherited
    public final StringPath clientReference;

    // inherited
    public final org.bson.types.QObjectId id;

    public final StringPath isDeleted = createString("isDeleted");

    public final StringPath projectID = createString("projectID");

    public final StringPath reportedDate = createString("reportedDate");

    public final StringPath sAssetState = createString("sAssetState");

    public final StringPath sEstimate = createString("sEstimate");

    public final StringPath sprintBeginDate = createString("sprintBeginDate");

    public final StringPath sprintEndDate = createString("sprintEndDate");

    public final StringPath sprintID = createString("sprintID");

    public final StringPath sSoftwareTesting = createString("sSoftwareTesting");

    public final StringPath sStatus = createString("sStatus");

    public final StringPath sToDo = createString("sToDo");

    public final StringPath storyID = createString("storyID");

    public final StringPath teamID = createString("teamID");

    //inherited
    public final DateTimePath<java.util.Date> upsertTime;

    public QFeatureHistory(String variable) {
        this(FeatureHistory.class, forVariable(variable), INITS);
    }

    public QFeatureHistory(Path<? extends FeatureHistory> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QFeatureHistory(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QFeatureHistory(PathMetadata metadata, PathInits inits) {
        this(FeatureHistory.class, metadata, inits);
    }

    public QFeatureHistory(Class<? extends FeatureHistory> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QBaseModel(type, metadata, inits);
        this.clientReference = _super.clientReference;
        this.id = _super.id;
        this.upsertTime = _super.upsertTime;
    }

}

