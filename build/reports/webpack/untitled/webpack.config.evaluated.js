{
  mode: 'development',
  resolve: {
    modules: [
      '/Users/admin/Desktop/My Computer/IntelJIde Proj/untitled/build/js/packages/untitled/kotlin-dce-dev',
      'node_modules'
    ]
  },
  plugins: [
    ProgressPlugin {
      profile: false,
      handler: [Function: handler],
      modulesCount: 5000,
      dependenciesCount: 10000,
      showEntries: true,
      showModules: true,
      showDependencies: true,
      showActiveModules: false,
      percentBy: undefined
    },
    TeamCityErrorPlugin {}
  ],
  module: {
    rules: [
      {
        test: /\.js$/,
        use: [
          'source-map-loader'
        ],
        enforce: 'pre'
      },
      {
        test: /\.css$/,
        use: [
          {
            loader: 'style-loader',
            options: {}
          },
          {
            loader: 'css-loader',
            options: {}
          }
        ]
      }
    ]
  },
  entry: {
    main: [
      '/Users/admin/Desktop/My Computer/IntelJIde Proj/untitled/build/js/packages/untitled/kotlin-dce-dev/untitled.js'
    ]
  },
  output: {
    path: '/Users/admin/Desktop/My Computer/IntelJIde Proj/untitled/build/distributions',
    filename: [Function: filename],
    library: 'untitled',
    libraryTarget: 'umd',
    globalObject: 'this'
  },
  devtool: 'eval-source-map',
  ignoreWarnings: [
    /Failed to parse source map/
  ],
  devServer: {
    open: true,
    static: [
      '/Users/admin/Desktop/My Computer/IntelJIde Proj/untitled/build/processedResources/js/main'
    ]
  },
  stats: {
    warnings: false,
    errors: false
  }
}