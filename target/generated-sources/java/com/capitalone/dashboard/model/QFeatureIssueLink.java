package com.capitalone.dashboard.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QFeatureIssueLink is a Querydsl query type for FeatureIssueLink
 */
@Generated("com.querydsl.codegen.EmbeddableSerializer")
public class QFeatureIssueLink extends BeanPath<FeatureIssueLink> {

    private static final long serialVersionUID = -585683457L;

    public static final QFeatureIssueLink featureIssueLink = new QFeatureIssueLink("featureIssueLink");

    public final StringPath issueLinkDirection = createString("issueLinkDirection");

    public final StringPath issueLinkName = createString("issueLinkName");

    public final StringPath issueLinkType = createString("issueLinkType");

    public final StringPath targetIssueKey = createString("targetIssueKey");

    public final StringPath targetIssueUri = createString("targetIssueUri");

    public QFeatureIssueLink(String variable) {
        super(FeatureIssueLink.class, forVariable(variable));
    }

    public QFeatureIssueLink(Path<? extends FeatureIssueLink> path) {
        super(path.getType(), path.getMetadata());
    }

    public QFeatureIssueLink(PathMetadata metadata) {
        super(FeatureIssueLink.class, metadata);
    }

}

