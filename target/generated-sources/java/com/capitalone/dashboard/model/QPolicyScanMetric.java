package com.capitalone.dashboard.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QPolicyScanMetric is a Querydsl query type for PolicyScanMetric
 */
@Generated("com.querydsl.codegen.EmbeddableSerializer")
public class QPolicyScanMetric extends BeanPath<PolicyScanMetric> {

    private static final long serialVersionUID = 1934302529L;

    public static final QPolicyScanMetric policyScanMetric = new QPolicyScanMetric("policyScanMetric");

    public final NumberPath<Integer> policyAffectedCount = createNumber("policyAffectedCount", Integer.class);

    public final NumberPath<Integer> policycriticalCount = createNumber("policycriticalCount", Integer.class);

    public final NumberPath<Integer> policysevereCount = createNumber("policysevereCount", Integer.class);

    public final NumberPath<Integer> polimoderateCount = createNumber("polimoderateCount", Integer.class);

    public QPolicyScanMetric(String variable) {
        super(PolicyScanMetric.class, forVariable(variable));
    }

    public QPolicyScanMetric(Path<? extends PolicyScanMetric> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPolicyScanMetric(PathMetadata metadata) {
        super(PolicyScanMetric.class, metadata);
    }

}

