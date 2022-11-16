// <auto-generated>
//     Generated by the protocol buffer compiler.  DO NOT EDIT!
//     source: protos/item.proto
// </auto-generated>
#pragma warning disable 0414, 1591, 8981
#region Designer generated code

using grpc = global::Grpc.Core;

namespace gRPCClient {
  public static partial class ItemService
  {
    static readonly string __ServiceName = "ItemService";

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static void __Helper_SerializeMessage(global::Google.Protobuf.IMessage message, grpc::SerializationContext context)
    {
      #if !GRPC_DISABLE_PROTOBUF_BUFFER_SERIALIZATION
      if (message is global::Google.Protobuf.IBufferMessage)
      {
        context.SetPayloadLength(message.CalculateSize());
        global::Google.Protobuf.MessageExtensions.WriteTo(message, context.GetBufferWriter());
        context.Complete();
        return;
      }
      #endif
      context.Complete(global::Google.Protobuf.MessageExtensions.ToByteArray(message));
    }

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static class __Helper_MessageCache<T>
    {
      public static readonly bool IsBufferMessage = global::System.Reflection.IntrospectionExtensions.GetTypeInfo(typeof(global::Google.Protobuf.IBufferMessage)).IsAssignableFrom(typeof(T));
    }

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static T __Helper_DeserializeMessage<T>(grpc::DeserializationContext context, global::Google.Protobuf.MessageParser<T> parser) where T : global::Google.Protobuf.IMessage<T>
    {
      #if !GRPC_DISABLE_PROTOBUF_BUFFER_SERIALIZATION
      if (__Helper_MessageCache<T>.IsBufferMessage)
      {
        return parser.ParseFrom(context.PayloadAsReadOnlySequence());
      }
      #endif
      return parser.ParseFrom(context.PayloadAsNewBuffer());
    }

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Marshaller<global::gRPCClient.SearchItemDTO> __Marshaller_SearchItemDTO = grpc::Marshallers.Create(__Helper_SerializeMessage, context => __Helper_DeserializeMessage(context, global::gRPCClient.SearchItemDTO.Parser));
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Marshaller<global::gRPCClient.Item> __Marshaller_Item = grpc::Marshallers.Create(__Helper_SerializeMessage, context => __Helper_DeserializeMessage(context, global::gRPCClient.Item.Parser));
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Marshaller<global::gRPCClient.CreateItemDTO> __Marshaller_CreateItemDTO = grpc::Marshallers.Create(__Helper_SerializeMessage, context => __Helper_DeserializeMessage(context, global::gRPCClient.CreateItemDTO.Parser));

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Method<global::gRPCClient.SearchItemDTO, global::gRPCClient.Item> __Method_getItem = new grpc::Method<global::gRPCClient.SearchItemDTO, global::gRPCClient.Item>(
        grpc::MethodType.Unary,
        __ServiceName,
        "getItem",
        __Marshaller_SearchItemDTO,
        __Marshaller_Item);

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Method<global::gRPCClient.CreateItemDTO, global::gRPCClient.Item> __Method_createItem = new grpc::Method<global::gRPCClient.CreateItemDTO, global::gRPCClient.Item>(
        grpc::MethodType.Unary,
        __ServiceName,
        "createItem",
        __Marshaller_CreateItemDTO,
        __Marshaller_Item);

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Method<global::gRPCClient.CreateItemDTO, global::gRPCClient.Item> __Method_updateItem = new grpc::Method<global::gRPCClient.CreateItemDTO, global::gRPCClient.Item>(
        grpc::MethodType.Unary,
        __ServiceName,
        "updateItem",
        __Marshaller_CreateItemDTO,
        __Marshaller_Item);

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Method<global::gRPCClient.SearchItemDTO, global::gRPCClient.Item> __Method_deleteItem = new grpc::Method<global::gRPCClient.SearchItemDTO, global::gRPCClient.Item>(
        grpc::MethodType.Unary,
        __ServiceName,
        "deleteItem",
        __Marshaller_SearchItemDTO,
        __Marshaller_Item);

    /// <summary>Service descriptor</summary>
    public static global::Google.Protobuf.Reflection.ServiceDescriptor Descriptor
    {
      get { return global::gRPCClient.ItemReflection.Descriptor.Services[0]; }
    }

    /// <summary>Client for ItemService</summary>
    public partial class ItemServiceClient : grpc::ClientBase<ItemServiceClient>
    {
      /// <summary>Creates a new client for ItemService</summary>
      /// <param name="channel">The channel to use to make remote calls.</param>
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public ItemServiceClient(grpc::ChannelBase channel) : base(channel)
      {
      }
      /// <summary>Creates a new client for ItemService that uses a custom <c>CallInvoker</c>.</summary>
      /// <param name="callInvoker">The callInvoker to use to make remote calls.</param>
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public ItemServiceClient(grpc::CallInvoker callInvoker) : base(callInvoker)
      {
      }
      /// <summary>Protected parameterless constructor to allow creation of test doubles.</summary>
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      protected ItemServiceClient() : base()
      {
      }
      /// <summary>Protected constructor to allow creation of configured clients.</summary>
      /// <param name="configuration">The client configuration.</param>
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      protected ItemServiceClient(ClientBaseConfiguration configuration) : base(configuration)
      {
      }

      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::gRPCClient.Item getItem(global::gRPCClient.SearchItemDTO request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return getItem(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::gRPCClient.Item getItem(global::gRPCClient.SearchItemDTO request, grpc::CallOptions options)
      {
        return CallInvoker.BlockingUnaryCall(__Method_getItem, null, options, request);
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual grpc::AsyncUnaryCall<global::gRPCClient.Item> getItemAsync(global::gRPCClient.SearchItemDTO request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return getItemAsync(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual grpc::AsyncUnaryCall<global::gRPCClient.Item> getItemAsync(global::gRPCClient.SearchItemDTO request, grpc::CallOptions options)
      {
        return CallInvoker.AsyncUnaryCall(__Method_getItem, null, options, request);
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::gRPCClient.Item createItem(global::gRPCClient.CreateItemDTO request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return createItem(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::gRPCClient.Item createItem(global::gRPCClient.CreateItemDTO request, grpc::CallOptions options)
      {
        return CallInvoker.BlockingUnaryCall(__Method_createItem, null, options, request);
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual grpc::AsyncUnaryCall<global::gRPCClient.Item> createItemAsync(global::gRPCClient.CreateItemDTO request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return createItemAsync(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual grpc::AsyncUnaryCall<global::gRPCClient.Item> createItemAsync(global::gRPCClient.CreateItemDTO request, grpc::CallOptions options)
      {
        return CallInvoker.AsyncUnaryCall(__Method_createItem, null, options, request);
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::gRPCClient.Item updateItem(global::gRPCClient.CreateItemDTO request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return updateItem(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::gRPCClient.Item updateItem(global::gRPCClient.CreateItemDTO request, grpc::CallOptions options)
      {
        return CallInvoker.BlockingUnaryCall(__Method_updateItem, null, options, request);
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual grpc::AsyncUnaryCall<global::gRPCClient.Item> updateItemAsync(global::gRPCClient.CreateItemDTO request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return updateItemAsync(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual grpc::AsyncUnaryCall<global::gRPCClient.Item> updateItemAsync(global::gRPCClient.CreateItemDTO request, grpc::CallOptions options)
      {
        return CallInvoker.AsyncUnaryCall(__Method_updateItem, null, options, request);
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::gRPCClient.Item deleteItem(global::gRPCClient.SearchItemDTO request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return deleteItem(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::gRPCClient.Item deleteItem(global::gRPCClient.SearchItemDTO request, grpc::CallOptions options)
      {
        return CallInvoker.BlockingUnaryCall(__Method_deleteItem, null, options, request);
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual grpc::AsyncUnaryCall<global::gRPCClient.Item> deleteItemAsync(global::gRPCClient.SearchItemDTO request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return deleteItemAsync(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual grpc::AsyncUnaryCall<global::gRPCClient.Item> deleteItemAsync(global::gRPCClient.SearchItemDTO request, grpc::CallOptions options)
      {
        return CallInvoker.AsyncUnaryCall(__Method_deleteItem, null, options, request);
      }
      /// <summary>Creates a new instance of client from given <c>ClientBaseConfiguration</c>.</summary>
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      protected override ItemServiceClient NewInstance(ClientBaseConfiguration configuration)
      {
        return new ItemServiceClient(configuration);
      }
    }

  }
}
#endregion