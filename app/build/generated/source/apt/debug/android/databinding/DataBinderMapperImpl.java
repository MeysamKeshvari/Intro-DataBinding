package android.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new meysam.androiddatabinding.DataBinderMapperImpl());
  }
}
