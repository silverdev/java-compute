/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.cloud.compute.v1.stub;

import static com.google.cloud.compute.v1.InstanceGroupManagerClient.AggregatedListInstanceGroupManagersPagedResponse;
import static com.google.cloud.compute.v1.InstanceGroupManagerClient.ListErrorsInstanceGroupManagersPagedResponse;
import static com.google.cloud.compute.v1.InstanceGroupManagerClient.ListInstanceGroupManagersPagedResponse;
import static com.google.cloud.compute.v1.InstanceGroupManagerClient.ListManagedInstancesInstanceGroupManagersPagedResponse;
import static com.google.cloud.compute.v1.InstanceGroupManagerClient.ListPerInstanceConfigsInstanceGroupManagersPagedResponse;

import com.google.api.core.ApiFunction;
import com.google.api.core.ApiFuture;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GaxProperties;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.httpjson.GaxHttpJsonProperties;
import com.google.api.gax.httpjson.HttpJsonTransportChannel;
import com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider;
import com.google.api.gax.retrying.RetrySettings;
import com.google.api.gax.rpc.ApiCallContext;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.PagedListDescriptor;
import com.google.api.gax.rpc.PagedListResponseFactory;
import com.google.api.gax.rpc.StatusCode;
import com.google.api.gax.rpc.StubSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.compute.v1.AbandonInstancesInstanceGroupManagerHttpRequest;
import com.google.cloud.compute.v1.AggregatedListInstanceGroupManagersHttpRequest;
import com.google.cloud.compute.v1.ApplyUpdatesToInstancesInstanceGroupManagerHttpRequest;
import com.google.cloud.compute.v1.CreateInstancesInstanceGroupManagerHttpRequest;
import com.google.cloud.compute.v1.DeleteInstanceGroupManagerHttpRequest;
import com.google.cloud.compute.v1.DeleteInstancesInstanceGroupManagerHttpRequest;
import com.google.cloud.compute.v1.DeletePerInstanceConfigsInstanceGroupManagerHttpRequest;
import com.google.cloud.compute.v1.GetInstanceGroupManagerHttpRequest;
import com.google.cloud.compute.v1.InsertInstanceGroupManagerHttpRequest;
import com.google.cloud.compute.v1.InstanceGroupManager;
import com.google.cloud.compute.v1.InstanceGroupManagerAggregatedList;
import com.google.cloud.compute.v1.InstanceGroupManagerList;
import com.google.cloud.compute.v1.InstanceGroupManagersListErrorsResponse;
import com.google.cloud.compute.v1.InstanceGroupManagersListManagedInstancesResponse;
import com.google.cloud.compute.v1.InstanceGroupManagersListPerInstanceConfigsResp;
import com.google.cloud.compute.v1.InstanceGroupManagersScopedList;
import com.google.cloud.compute.v1.InstanceManagedByIgmError;
import com.google.cloud.compute.v1.ListErrorsInstanceGroupManagersHttpRequest;
import com.google.cloud.compute.v1.ListInstanceGroupManagersHttpRequest;
import com.google.cloud.compute.v1.ListManagedInstancesInstanceGroupManagersHttpRequest;
import com.google.cloud.compute.v1.ListPerInstanceConfigsInstanceGroupManagersHttpRequest;
import com.google.cloud.compute.v1.ManagedInstance;
import com.google.cloud.compute.v1.Operation;
import com.google.cloud.compute.v1.PatchInstanceGroupManagerHttpRequest;
import com.google.cloud.compute.v1.PatchPerInstanceConfigsInstanceGroupManagerHttpRequest;
import com.google.cloud.compute.v1.PerInstanceConfig;
import com.google.cloud.compute.v1.RecreateInstancesInstanceGroupManagerHttpRequest;
import com.google.cloud.compute.v1.ResizeInstanceGroupManagerHttpRequest;
import com.google.cloud.compute.v1.SetInstanceTemplateInstanceGroupManagerHttpRequest;
import com.google.cloud.compute.v1.SetTargetPoolsInstanceGroupManagerHttpRequest;
import com.google.cloud.compute.v1.UpdatePerInstanceConfigsInstanceGroupManagerHttpRequest;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;
import org.threeten.bp.Duration;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Settings class to configure an instance of {@link InstanceGroupManagerStub}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (https://compute.googleapis.com/compute/v1/projects/) and
 *       default port (443) are used.
 *   <li>Credentials are acquired automatically through Application Default Credentials.
 *   <li>Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object.
 *
 * <p>For example, to set the total timeout of abandonInstancesInstanceGroupManager to 30 seconds:
 *
 * <pre>
 * <code>
 * InstanceGroupManagerStubSettings.Builder instanceGroupManagerSettingsBuilder =
 *     InstanceGroupManagerStubSettings.newBuilder();
 * instanceGroupManagerSettingsBuilder
 *     .abandonInstancesInstanceGroupManagerSettings()
 *     .setRetrySettings(
 *         instanceGroupManagerSettingsBuilder.abandonInstancesInstanceGroupManagerSettings().getRetrySettings().toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * InstanceGroupManagerStubSettings instanceGroupManagerSettings = instanceGroupManagerSettingsBuilder.build();
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class InstanceGroupManagerStubSettings
    extends StubSettings<InstanceGroupManagerStubSettings> {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder()
          .add("https://www.googleapis.com/auth/cloud-platform")
          .add("https://www.googleapis.com/auth/compute")
          .add("https://www.googleapis.com/auth/compute.readonly")
          .add("https://www.googleapis.com/auth/devstorage.full_control")
          .add("https://www.googleapis.com/auth/devstorage.read_only")
          .add("https://www.googleapis.com/auth/devstorage.read_write")
          .build();

  private final UnaryCallSettings<AbandonInstancesInstanceGroupManagerHttpRequest, Operation>
      abandonInstancesInstanceGroupManagerSettings;
  private final PagedCallSettings<
          AggregatedListInstanceGroupManagersHttpRequest,
          InstanceGroupManagerAggregatedList,
          AggregatedListInstanceGroupManagersPagedResponse>
      aggregatedListInstanceGroupManagersSettings;
  private final UnaryCallSettings<ApplyUpdatesToInstancesInstanceGroupManagerHttpRequest, Operation>
      applyUpdatesToInstancesInstanceGroupManagerSettings;
  private final UnaryCallSettings<CreateInstancesInstanceGroupManagerHttpRequest, Operation>
      createInstancesInstanceGroupManagerSettings;
  private final UnaryCallSettings<DeleteInstanceGroupManagerHttpRequest, Operation>
      deleteInstanceGroupManagerSettings;
  private final UnaryCallSettings<DeleteInstancesInstanceGroupManagerHttpRequest, Operation>
      deleteInstancesInstanceGroupManagerSettings;
  private final UnaryCallSettings<
          DeletePerInstanceConfigsInstanceGroupManagerHttpRequest, Operation>
      deletePerInstanceConfigsInstanceGroupManagerSettings;
  private final UnaryCallSettings<GetInstanceGroupManagerHttpRequest, InstanceGroupManager>
      getInstanceGroupManagerSettings;
  private final UnaryCallSettings<InsertInstanceGroupManagerHttpRequest, Operation>
      insertInstanceGroupManagerSettings;
  private final PagedCallSettings<
          ListInstanceGroupManagersHttpRequest,
          InstanceGroupManagerList,
          ListInstanceGroupManagersPagedResponse>
      listInstanceGroupManagersSettings;
  private final PagedCallSettings<
          ListErrorsInstanceGroupManagersHttpRequest,
          InstanceGroupManagersListErrorsResponse,
          ListErrorsInstanceGroupManagersPagedResponse>
      listErrorsInstanceGroupManagersSettings;
  private final PagedCallSettings<
          ListManagedInstancesInstanceGroupManagersHttpRequest,
          InstanceGroupManagersListManagedInstancesResponse,
          ListManagedInstancesInstanceGroupManagersPagedResponse>
      listManagedInstancesInstanceGroupManagersSettings;
  private final PagedCallSettings<
          ListPerInstanceConfigsInstanceGroupManagersHttpRequest,
          InstanceGroupManagersListPerInstanceConfigsResp,
          ListPerInstanceConfigsInstanceGroupManagersPagedResponse>
      listPerInstanceConfigsInstanceGroupManagersSettings;
  private final UnaryCallSettings<PatchInstanceGroupManagerHttpRequest, Operation>
      patchInstanceGroupManagerSettings;
  private final UnaryCallSettings<PatchPerInstanceConfigsInstanceGroupManagerHttpRequest, Operation>
      patchPerInstanceConfigsInstanceGroupManagerSettings;
  private final UnaryCallSettings<RecreateInstancesInstanceGroupManagerHttpRequest, Operation>
      recreateInstancesInstanceGroupManagerSettings;
  private final UnaryCallSettings<ResizeInstanceGroupManagerHttpRequest, Operation>
      resizeInstanceGroupManagerSettings;
  private final UnaryCallSettings<SetInstanceTemplateInstanceGroupManagerHttpRequest, Operation>
      setInstanceTemplateInstanceGroupManagerSettings;
  private final UnaryCallSettings<SetTargetPoolsInstanceGroupManagerHttpRequest, Operation>
      setTargetPoolsInstanceGroupManagerSettings;
  private final UnaryCallSettings<
          UpdatePerInstanceConfigsInstanceGroupManagerHttpRequest, Operation>
      updatePerInstanceConfigsInstanceGroupManagerSettings;

  /**
   * Returns the object with the settings used for calls to abandonInstancesInstanceGroupManager.
   */
  public UnaryCallSettings<AbandonInstancesInstanceGroupManagerHttpRequest, Operation>
      abandonInstancesInstanceGroupManagerSettings() {
    return abandonInstancesInstanceGroupManagerSettings;
  }

  /** Returns the object with the settings used for calls to aggregatedListInstanceGroupManagers. */
  public PagedCallSettings<
          AggregatedListInstanceGroupManagersHttpRequest,
          InstanceGroupManagerAggregatedList,
          AggregatedListInstanceGroupManagersPagedResponse>
      aggregatedListInstanceGroupManagersSettings() {
    return aggregatedListInstanceGroupManagersSettings;
  }

  /**
   * Returns the object with the settings used for calls to
   * applyUpdatesToInstancesInstanceGroupManager.
   */
  public UnaryCallSettings<ApplyUpdatesToInstancesInstanceGroupManagerHttpRequest, Operation>
      applyUpdatesToInstancesInstanceGroupManagerSettings() {
    return applyUpdatesToInstancesInstanceGroupManagerSettings;
  }

  /** Returns the object with the settings used for calls to createInstancesInstanceGroupManager. */
  public UnaryCallSettings<CreateInstancesInstanceGroupManagerHttpRequest, Operation>
      createInstancesInstanceGroupManagerSettings() {
    return createInstancesInstanceGroupManagerSettings;
  }

  /** Returns the object with the settings used for calls to deleteInstanceGroupManager. */
  public UnaryCallSettings<DeleteInstanceGroupManagerHttpRequest, Operation>
      deleteInstanceGroupManagerSettings() {
    return deleteInstanceGroupManagerSettings;
  }

  /** Returns the object with the settings used for calls to deleteInstancesInstanceGroupManager. */
  public UnaryCallSettings<DeleteInstancesInstanceGroupManagerHttpRequest, Operation>
      deleteInstancesInstanceGroupManagerSettings() {
    return deleteInstancesInstanceGroupManagerSettings;
  }

  /**
   * Returns the object with the settings used for calls to
   * deletePerInstanceConfigsInstanceGroupManager.
   */
  public UnaryCallSettings<DeletePerInstanceConfigsInstanceGroupManagerHttpRequest, Operation>
      deletePerInstanceConfigsInstanceGroupManagerSettings() {
    return deletePerInstanceConfigsInstanceGroupManagerSettings;
  }

  /** Returns the object with the settings used for calls to getInstanceGroupManager. */
  public UnaryCallSettings<GetInstanceGroupManagerHttpRequest, InstanceGroupManager>
      getInstanceGroupManagerSettings() {
    return getInstanceGroupManagerSettings;
  }

  /** Returns the object with the settings used for calls to insertInstanceGroupManager. */
  public UnaryCallSettings<InsertInstanceGroupManagerHttpRequest, Operation>
      insertInstanceGroupManagerSettings() {
    return insertInstanceGroupManagerSettings;
  }

  /** Returns the object with the settings used for calls to listInstanceGroupManagers. */
  public PagedCallSettings<
          ListInstanceGroupManagersHttpRequest,
          InstanceGroupManagerList,
          ListInstanceGroupManagersPagedResponse>
      listInstanceGroupManagersSettings() {
    return listInstanceGroupManagersSettings;
  }

  /** Returns the object with the settings used for calls to listErrorsInstanceGroupManagers. */
  public PagedCallSettings<
          ListErrorsInstanceGroupManagersHttpRequest,
          InstanceGroupManagersListErrorsResponse,
          ListErrorsInstanceGroupManagersPagedResponse>
      listErrorsInstanceGroupManagersSettings() {
    return listErrorsInstanceGroupManagersSettings;
  }

  /**
   * Returns the object with the settings used for calls to
   * listManagedInstancesInstanceGroupManagers.
   */
  public PagedCallSettings<
          ListManagedInstancesInstanceGroupManagersHttpRequest,
          InstanceGroupManagersListManagedInstancesResponse,
          ListManagedInstancesInstanceGroupManagersPagedResponse>
      listManagedInstancesInstanceGroupManagersSettings() {
    return listManagedInstancesInstanceGroupManagersSettings;
  }

  /**
   * Returns the object with the settings used for calls to
   * listPerInstanceConfigsInstanceGroupManagers.
   */
  public PagedCallSettings<
          ListPerInstanceConfigsInstanceGroupManagersHttpRequest,
          InstanceGroupManagersListPerInstanceConfigsResp,
          ListPerInstanceConfigsInstanceGroupManagersPagedResponse>
      listPerInstanceConfigsInstanceGroupManagersSettings() {
    return listPerInstanceConfigsInstanceGroupManagersSettings;
  }

  /** Returns the object with the settings used for calls to patchInstanceGroupManager. */
  public UnaryCallSettings<PatchInstanceGroupManagerHttpRequest, Operation>
      patchInstanceGroupManagerSettings() {
    return patchInstanceGroupManagerSettings;
  }

  /**
   * Returns the object with the settings used for calls to
   * patchPerInstanceConfigsInstanceGroupManager.
   */
  public UnaryCallSettings<PatchPerInstanceConfigsInstanceGroupManagerHttpRequest, Operation>
      patchPerInstanceConfigsInstanceGroupManagerSettings() {
    return patchPerInstanceConfigsInstanceGroupManagerSettings;
  }

  /**
   * Returns the object with the settings used for calls to recreateInstancesInstanceGroupManager.
   */
  public UnaryCallSettings<RecreateInstancesInstanceGroupManagerHttpRequest, Operation>
      recreateInstancesInstanceGroupManagerSettings() {
    return recreateInstancesInstanceGroupManagerSettings;
  }

  /** Returns the object with the settings used for calls to resizeInstanceGroupManager. */
  public UnaryCallSettings<ResizeInstanceGroupManagerHttpRequest, Operation>
      resizeInstanceGroupManagerSettings() {
    return resizeInstanceGroupManagerSettings;
  }

  /**
   * Returns the object with the settings used for calls to setInstanceTemplateInstanceGroupManager.
   */
  public UnaryCallSettings<SetInstanceTemplateInstanceGroupManagerHttpRequest, Operation>
      setInstanceTemplateInstanceGroupManagerSettings() {
    return setInstanceTemplateInstanceGroupManagerSettings;
  }

  /** Returns the object with the settings used for calls to setTargetPoolsInstanceGroupManager. */
  public UnaryCallSettings<SetTargetPoolsInstanceGroupManagerHttpRequest, Operation>
      setTargetPoolsInstanceGroupManagerSettings() {
    return setTargetPoolsInstanceGroupManagerSettings;
  }

  /**
   * Returns the object with the settings used for calls to
   * updatePerInstanceConfigsInstanceGroupManager.
   */
  public UnaryCallSettings<UpdatePerInstanceConfigsInstanceGroupManagerHttpRequest, Operation>
      updatePerInstanceConfigsInstanceGroupManagerSettings() {
    return updatePerInstanceConfigsInstanceGroupManagerSettings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public InstanceGroupManagerStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(HttpJsonTransportChannel.getHttpJsonTransportName())) {
      return HttpJsonInstanceGroupManagerStub.create(this);
    } else {
      throw new UnsupportedOperationException(
          "Transport not supported: " + getTransportChannelProvider().getTransportName());
    }
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return InstantiatingExecutorProvider.newBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return "https://compute.googleapis.com/compute/v1/projects/";
  }

  /** Returns the default service port. */
  public static int getDefaultServicePort() {
    return 443;
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return DEFAULT_SERVICE_SCOPES;
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return GoogleCredentialsProvider.newBuilder().setScopesToApply(DEFAULT_SERVICE_SCOPES);
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingHttpJsonChannelProvider.Builder
      defaultHttpJsonTransportProviderBuilder() {
    return InstantiatingHttpJsonChannelProvider.newBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return defaultHttpJsonTransportProviderBuilder().build();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return ApiClientHeaderProvider.newBuilder()
        .setGeneratedLibToken(
            "gapic", GaxProperties.getLibraryVersion(InstanceGroupManagerStubSettings.class))
        .setTransportToken(
            GaxHttpJsonProperties.getHttpJsonTokenName(),
            GaxHttpJsonProperties.getHttpJsonVersion());
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder() {
    return Builder.createDefault();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder(ClientContext clientContext) {
    return new Builder(clientContext);
  }

  /** Returns a builder containing all the values of this settings class. */
  public Builder toBuilder() {
    return new Builder(this);
  }

  protected InstanceGroupManagerStubSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    abandonInstancesInstanceGroupManagerSettings =
        settingsBuilder.abandonInstancesInstanceGroupManagerSettings().build();
    aggregatedListInstanceGroupManagersSettings =
        settingsBuilder.aggregatedListInstanceGroupManagersSettings().build();
    applyUpdatesToInstancesInstanceGroupManagerSettings =
        settingsBuilder.applyUpdatesToInstancesInstanceGroupManagerSettings().build();
    createInstancesInstanceGroupManagerSettings =
        settingsBuilder.createInstancesInstanceGroupManagerSettings().build();
    deleteInstanceGroupManagerSettings =
        settingsBuilder.deleteInstanceGroupManagerSettings().build();
    deleteInstancesInstanceGroupManagerSettings =
        settingsBuilder.deleteInstancesInstanceGroupManagerSettings().build();
    deletePerInstanceConfigsInstanceGroupManagerSettings =
        settingsBuilder.deletePerInstanceConfigsInstanceGroupManagerSettings().build();
    getInstanceGroupManagerSettings = settingsBuilder.getInstanceGroupManagerSettings().build();
    insertInstanceGroupManagerSettings =
        settingsBuilder.insertInstanceGroupManagerSettings().build();
    listInstanceGroupManagersSettings = settingsBuilder.listInstanceGroupManagersSettings().build();
    listErrorsInstanceGroupManagersSettings =
        settingsBuilder.listErrorsInstanceGroupManagersSettings().build();
    listManagedInstancesInstanceGroupManagersSettings =
        settingsBuilder.listManagedInstancesInstanceGroupManagersSettings().build();
    listPerInstanceConfigsInstanceGroupManagersSettings =
        settingsBuilder.listPerInstanceConfigsInstanceGroupManagersSettings().build();
    patchInstanceGroupManagerSettings = settingsBuilder.patchInstanceGroupManagerSettings().build();
    patchPerInstanceConfigsInstanceGroupManagerSettings =
        settingsBuilder.patchPerInstanceConfigsInstanceGroupManagerSettings().build();
    recreateInstancesInstanceGroupManagerSettings =
        settingsBuilder.recreateInstancesInstanceGroupManagerSettings().build();
    resizeInstanceGroupManagerSettings =
        settingsBuilder.resizeInstanceGroupManagerSettings().build();
    setInstanceTemplateInstanceGroupManagerSettings =
        settingsBuilder.setInstanceTemplateInstanceGroupManagerSettings().build();
    setTargetPoolsInstanceGroupManagerSettings =
        settingsBuilder.setTargetPoolsInstanceGroupManagerSettings().build();
    updatePerInstanceConfigsInstanceGroupManagerSettings =
        settingsBuilder.updatePerInstanceConfigsInstanceGroupManagerSettings().build();
  }

  private static final PagedListDescriptor<
          AggregatedListInstanceGroupManagersHttpRequest,
          InstanceGroupManagerAggregatedList,
          InstanceGroupManagersScopedList>
      AGGREGATED_LIST_INSTANCE_GROUP_MANAGERS_PAGE_STR_DESC =
          new PagedListDescriptor<
              AggregatedListInstanceGroupManagersHttpRequest,
              InstanceGroupManagerAggregatedList,
              InstanceGroupManagersScopedList>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public AggregatedListInstanceGroupManagersHttpRequest injectToken(
                AggregatedListInstanceGroupManagersHttpRequest payload, String token) {
              return AggregatedListInstanceGroupManagersHttpRequest.newBuilder(payload)
                  .setPageToken(token)
                  .build();
            }

            @Override
            public AggregatedListInstanceGroupManagersHttpRequest injectPageSize(
                AggregatedListInstanceGroupManagersHttpRequest payload, int pageSize) {
              return AggregatedListInstanceGroupManagersHttpRequest.newBuilder(payload)
                  .setMaxResults(pageSize)
                  .build();
            }

            @Override
            public Integer extractPageSize(AggregatedListInstanceGroupManagersHttpRequest payload) {
              return payload.getMaxResults();
            }

            @Override
            public String extractNextToken(InstanceGroupManagerAggregatedList payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<InstanceGroupManagersScopedList> extractResources(
                InstanceGroupManagerAggregatedList payload) {
              return payload.getItemsMap() != null
                  ? payload.getItemsMap().values()
                  : ImmutableList.<InstanceGroupManagersScopedList>of();
            }
          };

  private static final PagedListDescriptor<
          ListInstanceGroupManagersHttpRequest, InstanceGroupManagerList, InstanceGroupManager>
      LIST_INSTANCE_GROUP_MANAGERS_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListInstanceGroupManagersHttpRequest,
              InstanceGroupManagerList,
              InstanceGroupManager>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListInstanceGroupManagersHttpRequest injectToken(
                ListInstanceGroupManagersHttpRequest payload, String token) {
              return ListInstanceGroupManagersHttpRequest.newBuilder(payload)
                  .setPageToken(token)
                  .build();
            }

            @Override
            public ListInstanceGroupManagersHttpRequest injectPageSize(
                ListInstanceGroupManagersHttpRequest payload, int pageSize) {
              return ListInstanceGroupManagersHttpRequest.newBuilder(payload)
                  .setMaxResults(pageSize)
                  .build();
            }

            @Override
            public Integer extractPageSize(ListInstanceGroupManagersHttpRequest payload) {
              return payload.getMaxResults();
            }

            @Override
            public String extractNextToken(InstanceGroupManagerList payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<InstanceGroupManager> extractResources(
                InstanceGroupManagerList payload) {
              return payload.getItemsList() != null
                  ? payload.getItemsList()
                  : ImmutableList.<InstanceGroupManager>of();
            }
          };

  private static final PagedListDescriptor<
          ListErrorsInstanceGroupManagersHttpRequest,
          InstanceGroupManagersListErrorsResponse,
          InstanceManagedByIgmError>
      LIST_ERRORS_INSTANCE_GROUP_MANAGERS_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListErrorsInstanceGroupManagersHttpRequest,
              InstanceGroupManagersListErrorsResponse,
              InstanceManagedByIgmError>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListErrorsInstanceGroupManagersHttpRequest injectToken(
                ListErrorsInstanceGroupManagersHttpRequest payload, String token) {
              return ListErrorsInstanceGroupManagersHttpRequest.newBuilder(payload)
                  .setPageToken(token)
                  .build();
            }

            @Override
            public ListErrorsInstanceGroupManagersHttpRequest injectPageSize(
                ListErrorsInstanceGroupManagersHttpRequest payload, int pageSize) {
              return ListErrorsInstanceGroupManagersHttpRequest.newBuilder(payload)
                  .setMaxResults(pageSize)
                  .build();
            }

            @Override
            public Integer extractPageSize(ListErrorsInstanceGroupManagersHttpRequest payload) {
              return payload.getMaxResults();
            }

            @Override
            public String extractNextToken(InstanceGroupManagersListErrorsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<InstanceManagedByIgmError> extractResources(
                InstanceGroupManagersListErrorsResponse payload) {
              return payload.getItemsList() != null
                  ? payload.getItemsList()
                  : ImmutableList.<InstanceManagedByIgmError>of();
            }
          };

  private static final PagedListDescriptor<
          ListManagedInstancesInstanceGroupManagersHttpRequest,
          InstanceGroupManagersListManagedInstancesResponse,
          ManagedInstance>
      LIST_MANAGED_INSTANCES_INSTANCE_GROUP_MANAGERS_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListManagedInstancesInstanceGroupManagersHttpRequest,
              InstanceGroupManagersListManagedInstancesResponse,
              ManagedInstance>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListManagedInstancesInstanceGroupManagersHttpRequest injectToken(
                ListManagedInstancesInstanceGroupManagersHttpRequest payload, String token) {
              return ListManagedInstancesInstanceGroupManagersHttpRequest.newBuilder(payload)
                  .setPageToken(token)
                  .build();
            }

            @Override
            public ListManagedInstancesInstanceGroupManagersHttpRequest injectPageSize(
                ListManagedInstancesInstanceGroupManagersHttpRequest payload, int pageSize) {
              return ListManagedInstancesInstanceGroupManagersHttpRequest.newBuilder(payload)
                  .setMaxResults(pageSize)
                  .build();
            }

            @Override
            public Integer extractPageSize(
                ListManagedInstancesInstanceGroupManagersHttpRequest payload) {
              return payload.getMaxResults();
            }

            @Override
            public String extractNextToken(
                InstanceGroupManagersListManagedInstancesResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<ManagedInstance> extractResources(
                InstanceGroupManagersListManagedInstancesResponse payload) {
              return payload.getManagedInstancesList() != null
                  ? payload.getManagedInstancesList()
                  : ImmutableList.<ManagedInstance>of();
            }
          };

  private static final PagedListDescriptor<
          ListPerInstanceConfigsInstanceGroupManagersHttpRequest,
          InstanceGroupManagersListPerInstanceConfigsResp,
          PerInstanceConfig>
      LIST_PER_INSTANCE_CONFIGS_INSTANCE_GROUP_MANAGERS_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListPerInstanceConfigsInstanceGroupManagersHttpRequest,
              InstanceGroupManagersListPerInstanceConfigsResp,
              PerInstanceConfig>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListPerInstanceConfigsInstanceGroupManagersHttpRequest injectToken(
                ListPerInstanceConfigsInstanceGroupManagersHttpRequest payload, String token) {
              return ListPerInstanceConfigsInstanceGroupManagersHttpRequest.newBuilder(payload)
                  .setPageToken(token)
                  .build();
            }

            @Override
            public ListPerInstanceConfigsInstanceGroupManagersHttpRequest injectPageSize(
                ListPerInstanceConfigsInstanceGroupManagersHttpRequest payload, int pageSize) {
              return ListPerInstanceConfigsInstanceGroupManagersHttpRequest.newBuilder(payload)
                  .setMaxResults(pageSize)
                  .build();
            }

            @Override
            public Integer extractPageSize(
                ListPerInstanceConfigsInstanceGroupManagersHttpRequest payload) {
              return payload.getMaxResults();
            }

            @Override
            public String extractNextToken(
                InstanceGroupManagersListPerInstanceConfigsResp payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<PerInstanceConfig> extractResources(
                InstanceGroupManagersListPerInstanceConfigsResp payload) {
              return payload.getItemsList() != null
                  ? payload.getItemsList()
                  : ImmutableList.<PerInstanceConfig>of();
            }
          };

  private static final PagedListResponseFactory<
          AggregatedListInstanceGroupManagersHttpRequest,
          InstanceGroupManagerAggregatedList,
          AggregatedListInstanceGroupManagersPagedResponse>
      AGGREGATED_LIST_INSTANCE_GROUP_MANAGERS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              AggregatedListInstanceGroupManagersHttpRequest,
              InstanceGroupManagerAggregatedList,
              AggregatedListInstanceGroupManagersPagedResponse>() {
            @Override
            public ApiFuture<AggregatedListInstanceGroupManagersPagedResponse>
                getFuturePagedResponse(
                    UnaryCallable<
                            AggregatedListInstanceGroupManagersHttpRequest,
                            InstanceGroupManagerAggregatedList>
                        callable,
                    AggregatedListInstanceGroupManagersHttpRequest request,
                    ApiCallContext context,
                    ApiFuture<InstanceGroupManagerAggregatedList> futureResponse) {
              PageContext<
                      AggregatedListInstanceGroupManagersHttpRequest,
                      InstanceGroupManagerAggregatedList,
                      InstanceGroupManagersScopedList>
                  pageContext =
                      PageContext.create(
                          callable,
                          AGGREGATED_LIST_INSTANCE_GROUP_MANAGERS_PAGE_STR_DESC,
                          request,
                          context);
              return AggregatedListInstanceGroupManagersPagedResponse.createAsync(
                  pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListInstanceGroupManagersHttpRequest,
          InstanceGroupManagerList,
          ListInstanceGroupManagersPagedResponse>
      LIST_INSTANCE_GROUP_MANAGERS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListInstanceGroupManagersHttpRequest,
              InstanceGroupManagerList,
              ListInstanceGroupManagersPagedResponse>() {
            @Override
            public ApiFuture<ListInstanceGroupManagersPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListInstanceGroupManagersHttpRequest, InstanceGroupManagerList>
                    callable,
                ListInstanceGroupManagersHttpRequest request,
                ApiCallContext context,
                ApiFuture<InstanceGroupManagerList> futureResponse) {
              PageContext<
                      ListInstanceGroupManagersHttpRequest,
                      InstanceGroupManagerList,
                      InstanceGroupManager>
                  pageContext =
                      PageContext.create(
                          callable, LIST_INSTANCE_GROUP_MANAGERS_PAGE_STR_DESC, request, context);
              return ListInstanceGroupManagersPagedResponse.createAsync(
                  pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListErrorsInstanceGroupManagersHttpRequest,
          InstanceGroupManagersListErrorsResponse,
          ListErrorsInstanceGroupManagersPagedResponse>
      LIST_ERRORS_INSTANCE_GROUP_MANAGERS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListErrorsInstanceGroupManagersHttpRequest,
              InstanceGroupManagersListErrorsResponse,
              ListErrorsInstanceGroupManagersPagedResponse>() {
            @Override
            public ApiFuture<ListErrorsInstanceGroupManagersPagedResponse> getFuturePagedResponse(
                UnaryCallable<
                        ListErrorsInstanceGroupManagersHttpRequest,
                        InstanceGroupManagersListErrorsResponse>
                    callable,
                ListErrorsInstanceGroupManagersHttpRequest request,
                ApiCallContext context,
                ApiFuture<InstanceGroupManagersListErrorsResponse> futureResponse) {
              PageContext<
                      ListErrorsInstanceGroupManagersHttpRequest,
                      InstanceGroupManagersListErrorsResponse,
                      InstanceManagedByIgmError>
                  pageContext =
                      PageContext.create(
                          callable,
                          LIST_ERRORS_INSTANCE_GROUP_MANAGERS_PAGE_STR_DESC,
                          request,
                          context);
              return ListErrorsInstanceGroupManagersPagedResponse.createAsync(
                  pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListManagedInstancesInstanceGroupManagersHttpRequest,
          InstanceGroupManagersListManagedInstancesResponse,
          ListManagedInstancesInstanceGroupManagersPagedResponse>
      LIST_MANAGED_INSTANCES_INSTANCE_GROUP_MANAGERS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListManagedInstancesInstanceGroupManagersHttpRequest,
              InstanceGroupManagersListManagedInstancesResponse,
              ListManagedInstancesInstanceGroupManagersPagedResponse>() {
            @Override
            public ApiFuture<ListManagedInstancesInstanceGroupManagersPagedResponse>
                getFuturePagedResponse(
                    UnaryCallable<
                            ListManagedInstancesInstanceGroupManagersHttpRequest,
                            InstanceGroupManagersListManagedInstancesResponse>
                        callable,
                    ListManagedInstancesInstanceGroupManagersHttpRequest request,
                    ApiCallContext context,
                    ApiFuture<InstanceGroupManagersListManagedInstancesResponse> futureResponse) {
              PageContext<
                      ListManagedInstancesInstanceGroupManagersHttpRequest,
                      InstanceGroupManagersListManagedInstancesResponse,
                      ManagedInstance>
                  pageContext =
                      PageContext.create(
                          callable,
                          LIST_MANAGED_INSTANCES_INSTANCE_GROUP_MANAGERS_PAGE_STR_DESC,
                          request,
                          context);
              return ListManagedInstancesInstanceGroupManagersPagedResponse.createAsync(
                  pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListPerInstanceConfigsInstanceGroupManagersHttpRequest,
          InstanceGroupManagersListPerInstanceConfigsResp,
          ListPerInstanceConfigsInstanceGroupManagersPagedResponse>
      LIST_PER_INSTANCE_CONFIGS_INSTANCE_GROUP_MANAGERS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListPerInstanceConfigsInstanceGroupManagersHttpRequest,
              InstanceGroupManagersListPerInstanceConfigsResp,
              ListPerInstanceConfigsInstanceGroupManagersPagedResponse>() {
            @Override
            public ApiFuture<ListPerInstanceConfigsInstanceGroupManagersPagedResponse>
                getFuturePagedResponse(
                    UnaryCallable<
                            ListPerInstanceConfigsInstanceGroupManagersHttpRequest,
                            InstanceGroupManagersListPerInstanceConfigsResp>
                        callable,
                    ListPerInstanceConfigsInstanceGroupManagersHttpRequest request,
                    ApiCallContext context,
                    ApiFuture<InstanceGroupManagersListPerInstanceConfigsResp> futureResponse) {
              PageContext<
                      ListPerInstanceConfigsInstanceGroupManagersHttpRequest,
                      InstanceGroupManagersListPerInstanceConfigsResp,
                      PerInstanceConfig>
                  pageContext =
                      PageContext.create(
                          callable,
                          LIST_PER_INSTANCE_CONFIGS_INSTANCE_GROUP_MANAGERS_PAGE_STR_DESC,
                          request,
                          context);
              return ListPerInstanceConfigsInstanceGroupManagersPagedResponse.createAsync(
                  pageContext, futureResponse);
            }
          };

  /** Builder for InstanceGroupManagerStubSettings. */
  public static class Builder
      extends StubSettings.Builder<InstanceGroupManagerStubSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;

    private final UnaryCallSettings.Builder<
            AbandonInstancesInstanceGroupManagerHttpRequest, Operation>
        abandonInstancesInstanceGroupManagerSettings;
    private final PagedCallSettings.Builder<
            AggregatedListInstanceGroupManagersHttpRequest,
            InstanceGroupManagerAggregatedList,
            AggregatedListInstanceGroupManagersPagedResponse>
        aggregatedListInstanceGroupManagersSettings;
    private final UnaryCallSettings.Builder<
            ApplyUpdatesToInstancesInstanceGroupManagerHttpRequest, Operation>
        applyUpdatesToInstancesInstanceGroupManagerSettings;
    private final UnaryCallSettings.Builder<
            CreateInstancesInstanceGroupManagerHttpRequest, Operation>
        createInstancesInstanceGroupManagerSettings;
    private final UnaryCallSettings.Builder<DeleteInstanceGroupManagerHttpRequest, Operation>
        deleteInstanceGroupManagerSettings;
    private final UnaryCallSettings.Builder<
            DeleteInstancesInstanceGroupManagerHttpRequest, Operation>
        deleteInstancesInstanceGroupManagerSettings;
    private final UnaryCallSettings.Builder<
            DeletePerInstanceConfigsInstanceGroupManagerHttpRequest, Operation>
        deletePerInstanceConfigsInstanceGroupManagerSettings;
    private final UnaryCallSettings.Builder<
            GetInstanceGroupManagerHttpRequest, InstanceGroupManager>
        getInstanceGroupManagerSettings;
    private final UnaryCallSettings.Builder<InsertInstanceGroupManagerHttpRequest, Operation>
        insertInstanceGroupManagerSettings;
    private final PagedCallSettings.Builder<
            ListInstanceGroupManagersHttpRequest,
            InstanceGroupManagerList,
            ListInstanceGroupManagersPagedResponse>
        listInstanceGroupManagersSettings;
    private final PagedCallSettings.Builder<
            ListErrorsInstanceGroupManagersHttpRequest,
            InstanceGroupManagersListErrorsResponse,
            ListErrorsInstanceGroupManagersPagedResponse>
        listErrorsInstanceGroupManagersSettings;
    private final PagedCallSettings.Builder<
            ListManagedInstancesInstanceGroupManagersHttpRequest,
            InstanceGroupManagersListManagedInstancesResponse,
            ListManagedInstancesInstanceGroupManagersPagedResponse>
        listManagedInstancesInstanceGroupManagersSettings;
    private final PagedCallSettings.Builder<
            ListPerInstanceConfigsInstanceGroupManagersHttpRequest,
            InstanceGroupManagersListPerInstanceConfigsResp,
            ListPerInstanceConfigsInstanceGroupManagersPagedResponse>
        listPerInstanceConfigsInstanceGroupManagersSettings;
    private final UnaryCallSettings.Builder<PatchInstanceGroupManagerHttpRequest, Operation>
        patchInstanceGroupManagerSettings;
    private final UnaryCallSettings.Builder<
            PatchPerInstanceConfigsInstanceGroupManagerHttpRequest, Operation>
        patchPerInstanceConfigsInstanceGroupManagerSettings;
    private final UnaryCallSettings.Builder<
            RecreateInstancesInstanceGroupManagerHttpRequest, Operation>
        recreateInstancesInstanceGroupManagerSettings;
    private final UnaryCallSettings.Builder<ResizeInstanceGroupManagerHttpRequest, Operation>
        resizeInstanceGroupManagerSettings;
    private final UnaryCallSettings.Builder<
            SetInstanceTemplateInstanceGroupManagerHttpRequest, Operation>
        setInstanceTemplateInstanceGroupManagerSettings;
    private final UnaryCallSettings.Builder<
            SetTargetPoolsInstanceGroupManagerHttpRequest, Operation>
        setTargetPoolsInstanceGroupManagerSettings;
    private final UnaryCallSettings.Builder<
            UpdatePerInstanceConfigsInstanceGroupManagerHttpRequest, Operation>
        updatePerInstanceConfigsInstanceGroupManagerSettings;

    private static final ImmutableMap<String, ImmutableSet<StatusCode.Code>>
        RETRYABLE_CODE_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, ImmutableSet<StatusCode.Code>> definitions =
          ImmutableMap.builder();
      definitions.put(
          "idempotent",
          ImmutableSet.copyOf(
              Lists.<StatusCode.Code>newArrayList(
                  StatusCode.Code.DEADLINE_EXCEEDED, StatusCode.Code.UNAVAILABLE)));
      definitions.put("non_idempotent", ImmutableSet.copyOf(Lists.<StatusCode.Code>newArrayList()));
      RETRYABLE_CODE_DEFINITIONS = definitions.build();
    }

    private static final ImmutableMap<String, RetrySettings> RETRY_PARAM_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, RetrySettings> definitions = ImmutableMap.builder();
      RetrySettings settings = null;
      settings =
          RetrySettings.newBuilder()
              .setInitialRetryDelay(Duration.ofMillis(100L))
              .setRetryDelayMultiplier(1.3)
              .setMaxRetryDelay(Duration.ofMillis(60000L))
              .setInitialRpcTimeout(Duration.ofMillis(20000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeout(Duration.ofMillis(20000L))
              .setTotalTimeout(Duration.ofMillis(600000L))
              .build();
      definitions.put("default", settings);
      RETRY_PARAM_DEFINITIONS = definitions.build();
    }

    protected Builder() {
      this((ClientContext) null);
    }

    protected Builder(ClientContext clientContext) {
      super(clientContext);

      abandonInstancesInstanceGroupManagerSettings =
          UnaryCallSettings.newUnaryCallSettingsBuilder();

      aggregatedListInstanceGroupManagersSettings =
          PagedCallSettings.newBuilder(AGGREGATED_LIST_INSTANCE_GROUP_MANAGERS_PAGE_STR_FACT);

      applyUpdatesToInstancesInstanceGroupManagerSettings =
          UnaryCallSettings.newUnaryCallSettingsBuilder();

      createInstancesInstanceGroupManagerSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      deleteInstanceGroupManagerSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      deleteInstancesInstanceGroupManagerSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      deletePerInstanceConfigsInstanceGroupManagerSettings =
          UnaryCallSettings.newUnaryCallSettingsBuilder();

      getInstanceGroupManagerSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      insertInstanceGroupManagerSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      listInstanceGroupManagersSettings =
          PagedCallSettings.newBuilder(LIST_INSTANCE_GROUP_MANAGERS_PAGE_STR_FACT);

      listErrorsInstanceGroupManagersSettings =
          PagedCallSettings.newBuilder(LIST_ERRORS_INSTANCE_GROUP_MANAGERS_PAGE_STR_FACT);

      listManagedInstancesInstanceGroupManagersSettings =
          PagedCallSettings.newBuilder(
              LIST_MANAGED_INSTANCES_INSTANCE_GROUP_MANAGERS_PAGE_STR_FACT);

      listPerInstanceConfigsInstanceGroupManagersSettings =
          PagedCallSettings.newBuilder(
              LIST_PER_INSTANCE_CONFIGS_INSTANCE_GROUP_MANAGERS_PAGE_STR_FACT);

      patchInstanceGroupManagerSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      patchPerInstanceConfigsInstanceGroupManagerSettings =
          UnaryCallSettings.newUnaryCallSettingsBuilder();

      recreateInstancesInstanceGroupManagerSettings =
          UnaryCallSettings.newUnaryCallSettingsBuilder();

      resizeInstanceGroupManagerSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      setInstanceTemplateInstanceGroupManagerSettings =
          UnaryCallSettings.newUnaryCallSettingsBuilder();

      setTargetPoolsInstanceGroupManagerSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      updatePerInstanceConfigsInstanceGroupManagerSettings =
          UnaryCallSettings.newUnaryCallSettingsBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              abandonInstancesInstanceGroupManagerSettings,
              aggregatedListInstanceGroupManagersSettings,
              applyUpdatesToInstancesInstanceGroupManagerSettings,
              createInstancesInstanceGroupManagerSettings,
              deleteInstanceGroupManagerSettings,
              deleteInstancesInstanceGroupManagerSettings,
              deletePerInstanceConfigsInstanceGroupManagerSettings,
              getInstanceGroupManagerSettings,
              insertInstanceGroupManagerSettings,
              listInstanceGroupManagersSettings,
              listErrorsInstanceGroupManagersSettings,
              listManagedInstancesInstanceGroupManagersSettings,
              listPerInstanceConfigsInstanceGroupManagersSettings,
              patchInstanceGroupManagerSettings,
              patchPerInstanceConfigsInstanceGroupManagerSettings,
              recreateInstancesInstanceGroupManagerSettings,
              resizeInstanceGroupManagerSettings,
              setInstanceTemplateInstanceGroupManagerSettings,
              setTargetPoolsInstanceGroupManagerSettings,
              updatePerInstanceConfigsInstanceGroupManagerSettings);

      initDefaults(this);
    }

    private static Builder createDefault() {
      Builder builder = new Builder((ClientContext) null);
      builder.setTransportChannelProvider(defaultTransportChannelProvider());
      builder.setCredentialsProvider(defaultCredentialsProviderBuilder().build());
      builder.setInternalHeaderProvider(defaultApiClientHeaderProviderBuilder().build());
      builder.setEndpoint(getDefaultEndpoint());
      return initDefaults(builder);
    }

    private static Builder initDefaults(Builder builder) {

      builder
          .abandonInstancesInstanceGroupManagerSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .aggregatedListInstanceGroupManagersSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .applyUpdatesToInstancesInstanceGroupManagerSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .createInstancesInstanceGroupManagerSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .deleteInstanceGroupManagerSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .deleteInstancesInstanceGroupManagerSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .deletePerInstanceConfigsInstanceGroupManagerSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .getInstanceGroupManagerSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .insertInstanceGroupManagerSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .listInstanceGroupManagersSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .listErrorsInstanceGroupManagersSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .listManagedInstancesInstanceGroupManagersSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .listPerInstanceConfigsInstanceGroupManagersSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .patchInstanceGroupManagerSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .patchPerInstanceConfigsInstanceGroupManagerSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .recreateInstancesInstanceGroupManagerSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .resizeInstanceGroupManagerSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .setInstanceTemplateInstanceGroupManagerSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .setTargetPoolsInstanceGroupManagerSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .updatePerInstanceConfigsInstanceGroupManagerSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      return builder;
    }

    protected Builder(InstanceGroupManagerStubSettings settings) {
      super(settings);

      abandonInstancesInstanceGroupManagerSettings =
          settings.abandonInstancesInstanceGroupManagerSettings.toBuilder();
      aggregatedListInstanceGroupManagersSettings =
          settings.aggregatedListInstanceGroupManagersSettings.toBuilder();
      applyUpdatesToInstancesInstanceGroupManagerSettings =
          settings.applyUpdatesToInstancesInstanceGroupManagerSettings.toBuilder();
      createInstancesInstanceGroupManagerSettings =
          settings.createInstancesInstanceGroupManagerSettings.toBuilder();
      deleteInstanceGroupManagerSettings = settings.deleteInstanceGroupManagerSettings.toBuilder();
      deleteInstancesInstanceGroupManagerSettings =
          settings.deleteInstancesInstanceGroupManagerSettings.toBuilder();
      deletePerInstanceConfigsInstanceGroupManagerSettings =
          settings.deletePerInstanceConfigsInstanceGroupManagerSettings.toBuilder();
      getInstanceGroupManagerSettings = settings.getInstanceGroupManagerSettings.toBuilder();
      insertInstanceGroupManagerSettings = settings.insertInstanceGroupManagerSettings.toBuilder();
      listInstanceGroupManagersSettings = settings.listInstanceGroupManagersSettings.toBuilder();
      listErrorsInstanceGroupManagersSettings =
          settings.listErrorsInstanceGroupManagersSettings.toBuilder();
      listManagedInstancesInstanceGroupManagersSettings =
          settings.listManagedInstancesInstanceGroupManagersSettings.toBuilder();
      listPerInstanceConfigsInstanceGroupManagersSettings =
          settings.listPerInstanceConfigsInstanceGroupManagersSettings.toBuilder();
      patchInstanceGroupManagerSettings = settings.patchInstanceGroupManagerSettings.toBuilder();
      patchPerInstanceConfigsInstanceGroupManagerSettings =
          settings.patchPerInstanceConfigsInstanceGroupManagerSettings.toBuilder();
      recreateInstancesInstanceGroupManagerSettings =
          settings.recreateInstancesInstanceGroupManagerSettings.toBuilder();
      resizeInstanceGroupManagerSettings = settings.resizeInstanceGroupManagerSettings.toBuilder();
      setInstanceTemplateInstanceGroupManagerSettings =
          settings.setInstanceTemplateInstanceGroupManagerSettings.toBuilder();
      setTargetPoolsInstanceGroupManagerSettings =
          settings.setTargetPoolsInstanceGroupManagerSettings.toBuilder();
      updatePerInstanceConfigsInstanceGroupManagerSettings =
          settings.updatePerInstanceConfigsInstanceGroupManagerSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              abandonInstancesInstanceGroupManagerSettings,
              aggregatedListInstanceGroupManagersSettings,
              applyUpdatesToInstancesInstanceGroupManagerSettings,
              createInstancesInstanceGroupManagerSettings,
              deleteInstanceGroupManagerSettings,
              deleteInstancesInstanceGroupManagerSettings,
              deletePerInstanceConfigsInstanceGroupManagerSettings,
              getInstanceGroupManagerSettings,
              insertInstanceGroupManagerSettings,
              listInstanceGroupManagersSettings,
              listErrorsInstanceGroupManagersSettings,
              listManagedInstancesInstanceGroupManagersSettings,
              listPerInstanceConfigsInstanceGroupManagersSettings,
              patchInstanceGroupManagerSettings,
              patchPerInstanceConfigsInstanceGroupManagerSettings,
              recreateInstancesInstanceGroupManagerSettings,
              resizeInstanceGroupManagerSettings,
              setInstanceTemplateInstanceGroupManagerSettings,
              setTargetPoolsInstanceGroupManagerSettings,
              updatePerInstanceConfigsInstanceGroupManagerSettings);
    }

    // NEXT_MAJOR_VER: remove 'throws Exception'
    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) throws Exception {
      super.applyToAllUnaryMethods(unaryMethodSettingsBuilders, settingsUpdater);
      return this;
    }

    public ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders() {
      return unaryMethodSettingsBuilders;
    }

    /**
     * Returns the builder for the settings used for calls to abandonInstancesInstanceGroupManager.
     */
    public UnaryCallSettings.Builder<AbandonInstancesInstanceGroupManagerHttpRequest, Operation>
        abandonInstancesInstanceGroupManagerSettings() {
      return abandonInstancesInstanceGroupManagerSettings;
    }

    /**
     * Returns the builder for the settings used for calls to aggregatedListInstanceGroupManagers.
     */
    public PagedCallSettings.Builder<
            AggregatedListInstanceGroupManagersHttpRequest,
            InstanceGroupManagerAggregatedList,
            AggregatedListInstanceGroupManagersPagedResponse>
        aggregatedListInstanceGroupManagersSettings() {
      return aggregatedListInstanceGroupManagersSettings;
    }

    /**
     * Returns the builder for the settings used for calls to
     * applyUpdatesToInstancesInstanceGroupManager.
     */
    public UnaryCallSettings.Builder<
            ApplyUpdatesToInstancesInstanceGroupManagerHttpRequest, Operation>
        applyUpdatesToInstancesInstanceGroupManagerSettings() {
      return applyUpdatesToInstancesInstanceGroupManagerSettings;
    }

    /**
     * Returns the builder for the settings used for calls to createInstancesInstanceGroupManager.
     */
    public UnaryCallSettings.Builder<CreateInstancesInstanceGroupManagerHttpRequest, Operation>
        createInstancesInstanceGroupManagerSettings() {
      return createInstancesInstanceGroupManagerSettings;
    }

    /** Returns the builder for the settings used for calls to deleteInstanceGroupManager. */
    public UnaryCallSettings.Builder<DeleteInstanceGroupManagerHttpRequest, Operation>
        deleteInstanceGroupManagerSettings() {
      return deleteInstanceGroupManagerSettings;
    }

    /**
     * Returns the builder for the settings used for calls to deleteInstancesInstanceGroupManager.
     */
    public UnaryCallSettings.Builder<DeleteInstancesInstanceGroupManagerHttpRequest, Operation>
        deleteInstancesInstanceGroupManagerSettings() {
      return deleteInstancesInstanceGroupManagerSettings;
    }

    /**
     * Returns the builder for the settings used for calls to
     * deletePerInstanceConfigsInstanceGroupManager.
     */
    public UnaryCallSettings.Builder<
            DeletePerInstanceConfigsInstanceGroupManagerHttpRequest, Operation>
        deletePerInstanceConfigsInstanceGroupManagerSettings() {
      return deletePerInstanceConfigsInstanceGroupManagerSettings;
    }

    /** Returns the builder for the settings used for calls to getInstanceGroupManager. */
    public UnaryCallSettings.Builder<GetInstanceGroupManagerHttpRequest, InstanceGroupManager>
        getInstanceGroupManagerSettings() {
      return getInstanceGroupManagerSettings;
    }

    /** Returns the builder for the settings used for calls to insertInstanceGroupManager. */
    public UnaryCallSettings.Builder<InsertInstanceGroupManagerHttpRequest, Operation>
        insertInstanceGroupManagerSettings() {
      return insertInstanceGroupManagerSettings;
    }

    /** Returns the builder for the settings used for calls to listInstanceGroupManagers. */
    public PagedCallSettings.Builder<
            ListInstanceGroupManagersHttpRequest,
            InstanceGroupManagerList,
            ListInstanceGroupManagersPagedResponse>
        listInstanceGroupManagersSettings() {
      return listInstanceGroupManagersSettings;
    }

    /** Returns the builder for the settings used for calls to listErrorsInstanceGroupManagers. */
    public PagedCallSettings.Builder<
            ListErrorsInstanceGroupManagersHttpRequest,
            InstanceGroupManagersListErrorsResponse,
            ListErrorsInstanceGroupManagersPagedResponse>
        listErrorsInstanceGroupManagersSettings() {
      return listErrorsInstanceGroupManagersSettings;
    }

    /**
     * Returns the builder for the settings used for calls to
     * listManagedInstancesInstanceGroupManagers.
     */
    public PagedCallSettings.Builder<
            ListManagedInstancesInstanceGroupManagersHttpRequest,
            InstanceGroupManagersListManagedInstancesResponse,
            ListManagedInstancesInstanceGroupManagersPagedResponse>
        listManagedInstancesInstanceGroupManagersSettings() {
      return listManagedInstancesInstanceGroupManagersSettings;
    }

    /**
     * Returns the builder for the settings used for calls to
     * listPerInstanceConfigsInstanceGroupManagers.
     */
    public PagedCallSettings.Builder<
            ListPerInstanceConfigsInstanceGroupManagersHttpRequest,
            InstanceGroupManagersListPerInstanceConfigsResp,
            ListPerInstanceConfigsInstanceGroupManagersPagedResponse>
        listPerInstanceConfigsInstanceGroupManagersSettings() {
      return listPerInstanceConfigsInstanceGroupManagersSettings;
    }

    /** Returns the builder for the settings used for calls to patchInstanceGroupManager. */
    public UnaryCallSettings.Builder<PatchInstanceGroupManagerHttpRequest, Operation>
        patchInstanceGroupManagerSettings() {
      return patchInstanceGroupManagerSettings;
    }

    /**
     * Returns the builder for the settings used for calls to
     * patchPerInstanceConfigsInstanceGroupManager.
     */
    public UnaryCallSettings.Builder<
            PatchPerInstanceConfigsInstanceGroupManagerHttpRequest, Operation>
        patchPerInstanceConfigsInstanceGroupManagerSettings() {
      return patchPerInstanceConfigsInstanceGroupManagerSettings;
    }

    /**
     * Returns the builder for the settings used for calls to recreateInstancesInstanceGroupManager.
     */
    public UnaryCallSettings.Builder<RecreateInstancesInstanceGroupManagerHttpRequest, Operation>
        recreateInstancesInstanceGroupManagerSettings() {
      return recreateInstancesInstanceGroupManagerSettings;
    }

    /** Returns the builder for the settings used for calls to resizeInstanceGroupManager. */
    public UnaryCallSettings.Builder<ResizeInstanceGroupManagerHttpRequest, Operation>
        resizeInstanceGroupManagerSettings() {
      return resizeInstanceGroupManagerSettings;
    }

    /**
     * Returns the builder for the settings used for calls to
     * setInstanceTemplateInstanceGroupManager.
     */
    public UnaryCallSettings.Builder<SetInstanceTemplateInstanceGroupManagerHttpRequest, Operation>
        setInstanceTemplateInstanceGroupManagerSettings() {
      return setInstanceTemplateInstanceGroupManagerSettings;
    }

    /**
     * Returns the builder for the settings used for calls to setTargetPoolsInstanceGroupManager.
     */
    public UnaryCallSettings.Builder<SetTargetPoolsInstanceGroupManagerHttpRequest, Operation>
        setTargetPoolsInstanceGroupManagerSettings() {
      return setTargetPoolsInstanceGroupManagerSettings;
    }

    /**
     * Returns the builder for the settings used for calls to
     * updatePerInstanceConfigsInstanceGroupManager.
     */
    public UnaryCallSettings.Builder<
            UpdatePerInstanceConfigsInstanceGroupManagerHttpRequest, Operation>
        updatePerInstanceConfigsInstanceGroupManagerSettings() {
      return updatePerInstanceConfigsInstanceGroupManagerSettings;
    }

    @Override
    public InstanceGroupManagerStubSettings build() throws IOException {
      return new InstanceGroupManagerStubSettings(this);
    }
  }
}
