package com.capitalone.dashboard.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QFeature is a Querydsl query type for Feature
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QFeature extends EntityPathBase<Feature> {

    private static final long serialVersionUID = 1844402388L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QFeature feature = new QFeature("feature");

    public final QBaseModel _super;

    public final StringPath changeDate = createString("changeDate");

    //inherited
    public final StringPath clientReference;

    public final org.bson.types.QObjectId collectorId;

    // inherited
    public final org.bson.types.QObjectId id;

    public final StringPath isDeleted = createString("isDeleted");

    public final CollectionPath<FeatureIssueLink, QFeatureIssueLink> issueLinks = this.<FeatureIssueLink, QFeatureIssueLink>createCollection("issueLinks", FeatureIssueLink.class, QFeatureIssueLink.class, PathInits.DIRECT2);

    public final StringPath sEpicAssetState = createString("sEpicAssetState");

    public final StringPath sEpicBeginDate = createString("sEpicBeginDate");

    public final StringPath sEpicChangeDate = createString("sEpicChangeDate");

    public final StringPath sEpicEndDate = createString("sEpicEndDate");

    public final StringPath sEpicID = createString("sEpicID");

    public final StringPath sEpicIsDeleted = createString("sEpicIsDeleted");

    public final StringPath sEpicName = createString("sEpicName");

    public final StringPath sEpicNumber = createString("sEpicNumber");

    public final StringPath sEpicType = createString("sEpicType");

    public final StringPath sEpicUrl = createString("sEpicUrl");

    public final StringPath sEstimate = createString("sEstimate");

    public final NumberPath<Integer> sEstimateTime = createNumber("sEstimateTime", Integer.class);

    public final StringPath sId = createString("sId");

    public final StringPath sName = createString("sName");

    public final StringPath sNumber = createString("sNumber");

    public final ListPath<String, StringPath> sOwnersChangeDate = this.<String, StringPath>createList("sOwnersChangeDate", String.class, StringPath.class, PathInits.DIRECT2);

    public final ListPath<String, StringPath> sOwnersFullName = this.<String, StringPath>createList("sOwnersFullName", String.class, StringPath.class, PathInits.DIRECT2);

    public final ListPath<String, StringPath> sOwnersID = this.<String, StringPath>createList("sOwnersID", String.class, StringPath.class, PathInits.DIRECT2);

    public final ListPath<String, StringPath> sOwnersIsDeleted = this.<String, StringPath>createList("sOwnersIsDeleted", String.class, StringPath.class, PathInits.DIRECT2);

    public final ListPath<String, StringPath> sOwnersShortName = this.<String, StringPath>createList("sOwnersShortName", String.class, StringPath.class, PathInits.DIRECT2);

    public final ListPath<String, StringPath> sOwnersState = this.<String, StringPath>createList("sOwnersState", String.class, StringPath.class, PathInits.DIRECT2);

    public final ListPath<String, StringPath> sOwnersUsername = this.<String, StringPath>createList("sOwnersUsername", String.class, StringPath.class, PathInits.DIRECT2);

    public final StringPath sProjectBeginDate = createString("sProjectBeginDate");

    public final StringPath sProjectChangeDate = createString("sProjectChangeDate");

    public final StringPath sProjectEndDate = createString("sProjectEndDate");

    public final StringPath sProjectID = createString("sProjectID");

    public final StringPath sProjectIsDeleted = createString("sProjectIsDeleted");

    public final StringPath sProjectName = createString("sProjectName");

    public final StringPath sProjectPath = createString("sProjectPath");

    public final StringPath sProjectState = createString("sProjectState");

    public final StringPath sSprintAssetState = createString("sSprintAssetState");

    public final StringPath sSprintBeginDate = createString("sSprintBeginDate");

    public final StringPath sSprintChangeDate = createString("sSprintChangeDate");

    public final StringPath sSprintEndDate = createString("sSprintEndDate");

    public final StringPath sSprintID = createString("sSprintID");

    public final StringPath sSprintIsDeleted = createString("sSprintIsDeleted");

    public final StringPath sSprintName = createString("sSprintName");

    public final StringPath sSprintUrl = createString("sSprintUrl");

    public final StringPath sState = createString("sState");

    public final StringPath sStatus = createString("sStatus");

    public final StringPath sTeamAssetState = createString("sTeamAssetState");

    public final StringPath sTeamChangeDate = createString("sTeamChangeDate");

    public final StringPath sTeamID = createString("sTeamID");

    public final StringPath sTeamIsDeleted = createString("sTeamIsDeleted");

    public final StringPath sTeamName = createString("sTeamName");

    public final StringPath sTypeId = createString("sTypeId");

    public final StringPath sTypeName = createString("sTypeName");

    public final StringPath sUrl = createString("sUrl");

    //inherited
    public final DateTimePath<java.util.Date> upsertTime;

    public QFeature(String variable) {
        this(Feature.class, forVariable(variable), INITS);
    }

    public QFeature(Path<? extends Feature> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QFeature(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QFeature(PathMetadata metadata, PathInits inits) {
        this(Feature.class, metadata, inits);
    }

    public QFeature(Class<? extends Feature> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QBaseModel(type, metadata, inits);
        this.clientReference = _super.clientReference;
        this.collectorId = inits.isInitialized("collectorId") ? new org.bson.types.QObjectId(forProperty("collectorId")) : null;
        this.id = _super.id;
        this.upsertTime = _super.upsertTime;
    }

}

